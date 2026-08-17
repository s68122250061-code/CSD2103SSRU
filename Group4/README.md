
CLASS AlgorithmA
    
    // ฟังก์ชันหลักในการประมวลผลนิพจน์
    FUNCTION evaluate(expression: String) -> ExpressionResult
        TRY
            startTime = System.nanoTime()
            counter = NEW OperationCounter()
            tokens = Tokenizer.tokenize(expression)
            
            IF tokens.isEmpty() THEN
                THROW Exception("รูปแบบผิดพลาด ไม่ถูกต้อง")
            END IF
            
            postfixList = infixToPostfix(tokens, counter)
            resultValue = evaluatePostfix(postfixList, counter)
            
            postfixString = String.join(" ", postfixList)
            executionTime = System.nanoTime() - startTime
            
            RETURN ExpressionResult.success(resultValue, postfixString, executionTime, counter)
            
        CATCH Exception e
            executionTime = System.nanoTime() - startTime
            RETURN ExpressionResult.error(e.getMessage(), executionTime, counter)
        END TRY
    END FUNCTION

    // 1. แปลง Infix List เป็น Postfix List (Shunting-Yard Algorithm)
    FUNCTION infixToPostfix(tokens: List<String>, counter: OperationCounter) -> List<String>
        postfixList = NEW List()
        operatorStack = NEW Stack()
        
        FOR EACH token IN tokens DO
            counter.incrementLoop()
            
            IF isNumber(token) THEN
                postfixList.add(token)
                
            ELSE IF token == "(" THEN
                operatorStack.push(token)
                counter.incrementPush()
                
            ELSE IF token == ")" THEN
                WHILE NOT operatorStack.isEmpty() AND operatorStack.peek() != "(" DO
                    counter.incrementLoop()
                    postfixList.add(operatorStack.pop())
                    counter.incrementPop()
                END WHILE
                
                IF operatorStack.isEmpty() THEN
                    THROW Exception("วงเล็บไม่จับคู่กัน")
                END IF
                
                operatorStack.pop() // ถอด "(" ออก
                counter.incrementPop()
                
            ELSE IF isOperator(token) THEN
                WHILE NOT operatorStack.isEmpty() AND operatorStack.peek() != "(" AND priority(operatorStack.peek()) >= priority(token) DO
                    counter.incrementLoop()
                    counter.incrementComparison()
                    postfixList.add(operatorStack.pop())
                    counter.incrementPop()
                END WHILE
                
                operatorStack.push(token)
                counter.incrementPush()
                
            ELSE
                THROW Exception("token ไม่ถูกต้อง: " + token)
            END IF
        END FOR
        
        // ย้ายตัวดำเนินการที่เหลือใน Stack ไปไว้ใน Postfix List
        WHILE NOT operatorStack.isEmpty() DO
            counter.incrementLoop()
            topToken = operatorStack.pop()
            counter.incrementPop()
            
            IF topToken == "(" THEN
                THROW Exception("วงเล็บไม่จับคู่กัน")
            END IF
            
            postfixList.add(topToken)
        END WHILE
        
        RETURN postfixList
    END FUNCTION

    // 2. คำนวณผลลัพธ์จาก Postfix List
    FUNCTION evaluatePostfix(postfixList: List<String>, counter: OperationCounter) -> Double
        operandStack = NEW Stack()
        
        FOR EACH token IN postfixList DO
            counter.incrementLoop()
            
            IF isNumber(token) THEN
                operandStack.push(parseDouble(token))
                counter.incrementPush()
                
            ELSE IF isOperator(token) THEN
                IF operandStack.size() < 2 THEN
                    THROW Exception("รูปแบบผิดพลาด: ตัวเลขไม่เพียงพอสำหรับเครื่องหมาย " + token)
                END IF
                
                b = operandStack.pop()
                a = operandStack.pop()
                counter.incrementPop()
                counter.incrementPop()
                
                result = calculate(a, token, b)
                operandStack.push(result)
                counter.incrementPush()
            END IF
        END FOR
        
        IF operandStack.size() != 1 THEN
            THROW Exception("รูปแบบผิดพลาด: ลำดับเครื่องหมายหรือตัวเลขไม่ถูกต้อง")
        END IF
        
        RETURN operandStack.pop()
    END FUNCTION

    // ฟังก์ชันช่วยประมวลผลทางคณิตศาสตร์
    FUNCTION calculate(a: Double, op: String, b: Double) -> Double
        SWITCH op DO
            CASE "+": RETURN a + b
            CASE "-": RETURN a - b
            CASE "*": RETURN a * b
            CASE "/": 
                IF b == 0 THEN 
                    THROW ArithmeticException("หารด้วยศูนย์")
                END IF
                RETURN a / b
            DEFAULT:
                THROW Exception("operator ไม่ถูกต้อง: " + op)
        END SWITCH
    END FUNCTION

    // กำหนดลำดับความสำคัญของตัวดำเนินการ
    FUNCTION priority(op: String) -> Integer
        IF op == "+" OR op == "-" THEN RETURN 1
        IF op == "*" OR op == "/" THEN RETURN 2
        RETURN 0
    END FUNCTION

END CLASS