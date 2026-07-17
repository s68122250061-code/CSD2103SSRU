# ใบงานทบทวนภาษา Java
คำชี้แจงสำหรับนักศึกษา
ให้นักศึกษาทำใบงานนี้เพื่อทบทวนความรู้ภาษา Java ที่จำเป็นต่อการเรียนเรื่องอัลกอริทึม ได้แก่ ตัว
แปร เงื่อนไข วนซ้ำ อาร์เรย์ เมธอด และการเขียนโปรแกรมแก้ปัญหาเบื้องต้น
ให้นักศึกษาเขียนโปรแกรมด้วยภาษา Java และส่งไฟล์.java หรืออัปโหลดลง GitHub ตามที่ผู้สอน
กำหนด
จุดประสงค์การเรียนรู้
หลังจากทำใบงานนี้ นักศึกษาสามารถ
1. เขียนโปรแกรม Java รับข้อมูลและแสดงผลได้
2. ใช้คำสั่ง if-else เพื่อตัดสินใจได้
3. ใช้คำสั่ง for และ while เพื่อวนซ้ำได้
4. ใช้ Array ในการเก็บและประมวลผลข้อมูลได้
5. เขียน Method เพื่อแบ่งการทำงานของโปรแกรมได้
6. อธิบายขั้นตอนการทำงานของโปรแกรมในรูปแบบ Pseudocode ได้
# ตอนที่ 1: ทบทวนคำสั่งพื้นฐาน Java
คำสั่ง
ให้นักศึกษาเติมคำตอบให้ถูกต้อง
1.1 คำสั่งแสดงผลข้อความในภาษา Java คืออะไร
- ตอบ: System.out.print(); / System.out.println();

1.2 คำสั่งรับค่าจากแป้นพิมพ์โดยใช้ Scanner ต้อง import อะไร
- ตอบ: import java.util.Scanner;

1.3 คำสั่งใดใช้ตรวจสอบเงื่อนไข
- ตอบ: if / else / if-else / switch-case

1.4 คำสั่งใดใช้วนซ้ำเมื่อทราบจำนวนรอบแน่นอน
- ตอบ: for loop

1.5 คำสั่งใดใช้วนซ้ำเมื่อยังไม่ทราบจำนวนรอบแน่นอน
- ตอบ: while / do-while

# ตอนที่ 2: วิเคราะห์โค้ด Java
คำสั่ง
ให้นักศึกษาอ่านโค้ดต่อไปนี้ แล้วตอบคำถาม

```text
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
    sum = sum + i;
    }
    System.out.println(sum); 
```

คำถาม
โปรแกรมนี้วนซ้ำทั้งหมดกี่รอบ
- ตอบ: วนช้ำ 5 รอบ

ค่าของตัวแปร sum หลังจบการทำงานคือเท่าใด
- ตอบ: 15

ผลลัพธ์ที่แสดงออกหน้าจอคืออะไร
- ตอบ: 15

โปรแกรมนี้ทำหน้าที่อะไร
- ตอบ: หาผลรวมตั้ง 1 ถึง 5

# ตอนที่ 3: เขียนโปรแกรมตรวจสอบเลขคู่หรือเลขคี่
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อรับตัวเลขจำนวนเต็ม 1 จำนวน แล้วตรวจสอบว่าเป็นเลขคู่หรือ
เลขคี่
เงื่อนไขของโปรแกรม
1. รับค่าตัวเลขจากผู้ใช้
2. ถ้าตัวเลขหารด้วย 2 ลงตัว ให้แสดงคำว่า Even number
3. ถ้าหารด้วย 2 ไม่ลงตัว ให้แสดงคำว่า Odd number

ตัวอย่างผลลัพธ์
Enter number: 8
Even number

Pseudocode
ให้นักศึกษาเขียน Pseudocode ก่อนเขียนโปรแกรม
```text
START
    Display "Enter number: "
    Input number
    IF number MOD 2 == 0 THEN
        Display "Even number"
    ELSE
        Display "Odd number"
    ENDIF
END
```
Java Code
```text
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } 
        else {
            System.out.println("Odd number");
        }
        sc.close();
    }
}
```
# ตอนที่ 4: เขียนโปรแกรมคำนวณคะแนนรวมและตัดสินผลผ่าน / ไม่ผ่าน
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อรับคะแนนกลางภาคและคะแนนปลายภาคจากนั้นคำนวณคะแนน
รวม และตัดสินว่านักศึกษาผ่านหรือไม่ผ่าน
เงื่อนไขของโปรแกรม
1. รับคะแนนกลางภาค
2. รับคะแนนปลายภาค
3. คำนวณคะแนนรวม
4. ถ้าคะแนนรวมตั้งแต่ 50 คะแนนขึ้นไป ให้แสดงคำว่า Pass
5. ถ้าคะแนนรวมน้อยกว่า 50 คะแนน ให้แสดงคำว่า Fail
ตัวอย่างผลลัพธ์
Enter midterm score: 25
Enter final score: 30
Total score = 55
Pass

Pseudocode
```text
START
    Display "Enter midterm score: "
    Input midtermScore
    Display "Enter final score: "
    Input finalScore
    
    totalScore = midtermScore + finalScore
    Display "Total score = ", totalScore
    
    IF totalScore >= 50 THEN
        Display "Pass"
    ELSE
        Display "Fail"
    ENDIF
END
```
Java Code
```text
import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter midterm score: ");
        int midtermScore = sc.nextInt();
        
        System.out.print("Enter final score: ");
        int finalScore = sc.nextInt();
        
        int totalScore = midtermScore + finalScore;
        System.out.println("Total score = " + totalScore);
        
        if (totalScore >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail"); 
        }
        sc.close();
    }
}
```
# ตอนที่ 5: เขียนโปรแกรมหาค่ามากที่สุด จากตัวเลข 3 จำนวน
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อรับตัวเลขจำนวนเต็ม 3 จำนวน แล้วแสดงค่าที่มากที่สุด
เงื่อนไขของโปรแกรม
1. รับตัวเลขจำนวนเต็ม 3 จำนวน
2. เปรียบเทียบค่าทั้ง 3 จำนวน
3. แสดงค่าที่มากที่สุด
ตัวอย่างผลลัพธ์
Enter number 1: 12
Enter number 2: 25
Enter number 3: 9
Maximum number = 25

Pseudocode
```text
START
    Display "Enter number 1: "
    Input num1
    Display "Enter number 2: "
    Input num2
    Display "Enter number 3: "
    Input num3
    
    max = num1 
    
    IF num2 > max THEN
        max = num2
    ENDIF
    
    IF num3 > max THEN
        max = num3
    ENDIF
    
    Display "Maximum number = ", max
END
```
Java Code
```text
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();
        
        int max = num1; 
        
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3; 
        }
        System.out.println("Maximum number = " + max);
        sc.close();
    }
}
```
# ตอนที่ 6: ทบทวน Array
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อรับคะแนนของนักศึกษา 5 คน เก็บไว้ใน Array แล้วคำนวณ
คะแนนรวมและค่าเฉลี่ย
เงื่อนไขของโปรแกรม
1. สร้าง Array สำหรับเก็บคะแนน 5 ค่า
2. รับคะแนนจากผู้ใช้ทีละคน
3. คำนวณคะแนนรวม
4. คำนวณค่าเฉลี่ย
5. แสดงคะแนนรวมและค่าเฉลี่ย
ตัวอย่างผลลัพธ์
Enter score 1: 70
Enter score 2: 80
Enter score 3: 65
Enter score 4: 90
Enter score 5: 75
Total score = 380
Average score = 76.0

Pseudocode
```text
START
    CREATE scores Array of size 5
    total = 0
    average = 0.0

    FOR i = 0 TO 4 DO
        Display "Enter score ", i + 1, ": "
        Input scores[i]
        total = total + scores[i]
    ENDFOR

    average = total / 5.0

    Display "Total score = ", total
    Display "Average score = ", average
END
```
Java Code
```text
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] scores = new int[5];
        double total = 0.0;
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
            total += scores[i];
        }
        
        double average = total / scores.length;

        System.out.println("Total score = " + total);
        System.out.println("Average score = " + average);
        sc.close();
    }
}
```
# ตอนที่ 7: ค้นหาข้อมูลใน Array
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อค้นหาชื่อในรายชื่อนักศึกษา 5 คน
เงื่อนไขของโปรแกรม
1. กำหนดรายชื่อนักศึกษา 5 คนไว้ใน Array
2. รับชื่อที่ต้องการค้นหาจากผู้ใช้
3. ตรวจสอบว่าชื่อนั้นมีอยู่ใน Array หรือไม่
4. ถ้าพบ ให้แสดงคำว่า Found
5. ถ้าไม่พบ ให้แสดงคำว่า Not Found
ตัวอย่างผลลัพธ์
Enter name to search: Somchai
Found

Pseudocode
```text
START
    CREATE names Array = ["A", "B", "C", "D", "E"]
    found = false

    Display "Enter name to search: "
    Input searchName

    FOR i = 0 TO 4 DO
        IF names[i] EQUALS searchName THEN
            found = true
            BREAK
        ENDIF
    ENDFOR

    IF found == true THEN
        Display "Found"
    ELSE
        Display "Not Found"
    ENDIF
END
```

Java Code
```text
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"A", "B", "C", "D", "E"};

        System.out.print("Enter name to search: ");
        String searchName = sc.next();

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) { 
                found = true;
                break;        
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found"); 
        }
        sc.close();
    }
}
```
# ตอนที่ 8: เขียน Method เพื่อหาค่ามากที่สุด
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java โดยสร้าง Method ชื่อ findMax เพื่อรับตัวเลข 2 จำนวน แล้วคืนค่าที่
มากที่สุด
เงื่อนไขของโปรแกรม
1. สร้าง Method ชื่อ findMax
2. Method รับค่าจำนวนเต็ม 2 ค่า
3. Method คืนค่าจำนวนที่มากที่สุด
4. ใน main ให้รับค่าจากผู้ใช้ 2 จำนวน
5. เรียกใช้ Method และแสดงผลลัพธ์
ตัวอย่างผลลัพธ์
Enter number 1: 15
Enter number 2: 22
Maximum number = 22

โครงสร้างโปรแกรม
```text
import java.util.Scanner;

public class ReviewMethod {
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        
        int max = findMax(num1, num2);
        System.out.println("Maximum number = " + max);
        scanner.close();
    }
}
```
# ตอนที่ 9: Debug โปรแกรม
คำสั่ง
โปรแกรมต่อไปนี้มีข้อผิดพลาด ให้นักศึกษาหาข้อผิดพลาดและแก้ไขให้ถูกต้อง
```text
public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
```
คำถาม
1. โปรแกรมนี้ผิดพลาดที่บรรทัดใด
- ตอบ: บรรทัดที่ 4
2. เพราะเหตุใดจึงเกิดข้อผิดพลาด
- ตอบ: เพราะ <= numbers.length ทำให้รอบสุดท้าย i มีค่าเท่ากับ numbers.length ซึ่งเกินขอบเขตของ Array จึงเกิด ArrayIndexOutOfBoundsException
3. ควรแก้ไขอย่างไร
- ตอบ: เปลี่ยนจาก i <= เป็น i < numbers.length

โค้ดที่แก้ไขแล้ว
```text
public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
```
# ตอนที่ 10: Mini Challenge
คำสั่ง
ให้นักศึกษาเลือกทำ 1 ข้อ จากโจทย์ต่อไปนี้
ตัวเลือกที่ 1: โปรแกรมนับจา นวนเลขค่แู ละเลขคี่
ให้รับตัวเลขจำนวนเต็ม 10 จำนวน เก็บใน Array แล้วนับว่ามีเลขคู่กี่จำนวน และเลขคี่กี่จำนวน
Output ที่ต้องแสดง
Even count = ...
Odd count = ...

# ตอนที่ 11: ใช้ GenAI ช่วยตรวจโค้ด
คำสั่ง
หลังจากเขียนโปรแกรมเสร็จ ให้นักศึกษาใช้ GenAI ช่วยตรวจสอบโค้ด 1 โปรแกรม แล้วตอบคำถาม
ต่อไปนี้
Prompt ที่ใช้ถาม AI
```text
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } 
        else {
            System.out.println("Odd number");
        }
        sc.close();
    }
}
```
ตัวอย่าง Prompt:
“ช่วยตรวจสอบโค้ด Java ต่อไปนี้ว่ามีข้อผิดพลาดหรือไม่ และอธิบายอย่างเข้าใจง่าย แต่ไม่ต้องเขียน
โค้ดใหม่ทั้งหมด”
คำถามวิเคราะห์
1. AI พบข้อผิดพลาดอะไรหรือไม่
- ตอบ: ไม่พบข้อผิดพลาด
2. คำแนะนำของ AI ถูกต้องหรือไม่ เพราะเหตุใด
- ตอบ: ถูกต้อง เพราะ AI ยืนยันว่าการทำงานโปรแกรมไม่มีจุดบกพร่อง
3. นักศึกษาแก้ไขโค้ดตาม AI หรือไม่
- ตอบ: ไม่ได้แก้ไข
4. นักศึกษาได้เรียนรู้อะไรจากการใช้ AI ตรวจโค้ด
- ตอบ: ได้คำยืนยันว่าถูกต้อง หากผิดก็จะได้รับคำแนะนำ
5. มีข้อควรระวังอะไรในการใช้ AI ช่วยเขียนโปรแกรม
- ตอบ: คัดลอกมาวางเลย โดยที่ไม่ทำความเข้าใจ

# งานที่ต้องส่ง
ให้นักศึกษาส่งงานดังต่อไปนี้
1. ไฟล์ Java อย่างน้อย 4 โปรแกรม
o ตรวจสอบเลขคู่/เลขคี่
o คำนวณคะแนนรวมและผ่าน/ไม่ผ่าน
o โปรแกรมเกี่ยวกับ Array
o Mini Challenge 1 โปรแกรม
2. เอกสารสั้นหรือ README ประกอบด้วย
o ชื่อโปรแกรม
o Input
o Process
o Output
o วิธีรันโปรแกรม
o สิ่งที่ได้เรียนรู้
2.1 โปรแกรม EvenOddCheck
- Input จำนวนเต็น 1 จำนวน
- Process รับค่าตัวเลขเข้ามา จากนั้นตรวจสอบเงื่อนไขว่าตัวเลขหารด้วย 2 ลงตัวหรือไม่
- Output แสดงคำว่า Even number(หากเป็นเลขคู่) หรือ Odd number(หากเป็นเลขคี่)
- วิธีรันโปรแกรม เปิด VS Code แล้วกดรันบน Main แล้วพิมพ์ค่าใน Terminal
- สิ่งที่ได้เรียนรู้ ได้เขียนโค้ด แบบรับค่าจากแป้นพิมพ์ และเขียนเงื่อนไข if-else

2.2 โปรแกรม GradeCheck
- Input คะแนนกลางภาคและปลายภาค
- Process นำคะแนนทั้งสองส่วนมาบวกกันเพื่อหาคะแนนรวม จากนั้นตรวจสอบเงื่อนไขว่าคะแนนรวมตั้งแต่ 50 คะแนนขึ้นไปหรือไม่
- Output คะแนนรวม แล้วแสดง Pass หรือ Fail
- วิธีรันโปรแกรม เปิด VS Code แล้วกดรันบน Main แล้วพิมพ์ค่าใน Terminal
- งที่ได้เรียนรู้ ได้เขียนโค้ด แบบรับค่าจากแป้นพิมพ์ และเขียนเงื่อนไข if-else

2.3 โปรแกรม Array
- Input คะแนนของนักศึกษา 5 คน
- Process ใช้ Array ขนาด 5 ช่องในการเก็บคะแนน วนลูปรับคะแนนทีละคน สะสมคะแนนรวมทั้งหมด แล้วนำไปหารด้วยจำนวนนักศึกษา (5) เพื่อหาค่าเฉลี่ย
- Output คะแนนรวม และคะแนนเฉลี่ย
- วิธีรันโปรแกรม เปิด VS Code แล้วกดรันบน Main แล้วพิมพ์ค่าใน Terminal
- สิ่งที่ได้เรียนรู้ ได้เขียนโค้ด แบบรับค่าจากแป้นพิมพ์ เขียนลูป for และเขียน Array

2.4 โปรแกรม EvenOddChallenge
- Process สร้าง Array ขนาด 10 ช่องเพื่อรับค่าตัวเลขทั้งหมด จากนั้นวนลูปเพื่อตรวจสอบทีละตัวว่าตัวเลขใดหาร 2 ลงตัวให้เพิ่มตัวนับเลขคู่ (Even) หากหารไม่ลงตัวให้เพิ่มตัวนับเลขคี่ (Odd)
- Input ตัวเลขจำนวนเต็ม 10 จำนวน
- Output จำนวนเลขคู่สะสม (Even count) และจำนวนเลขคี่สะสม (Odd count)
- วิธีรันโปรแกรม เปิด VS Code แล้วกดรันบน Main แล้วพิมพ์ค่าใน Terminal
- สิ่งที่ได้เรียนรู้ ได้เขียนโค้ด แบบรับค่าจากแป้นพิมพ์ เขียนเงื่อนไข if-else และเขียน Array

3. คำตอบ Reflection จากตอนที่ 11
3.1 AI พบข้อผิดพลาดอะไรหรือไม่
- ตอบ: ไม่พบข้อผิดพลาด
3.2 คำแนะนำของ AI ถูกต้องหรือไม่ เพราะเหตุใด
- ตอบ: ถูกต้อง เพราะ AI ยืนยันว่าการทำงานโปรแกรมไม่มีจุดบกพร่อง
3.3 นักศึกษาแก้ไขโค้ดตาม AI หรือไม่
- ตอบ: ไม่ได้แก้ไข
3.4 นักศึกษาได้เรียนรู้อะไรจากการใช้ AI ตรวจโค้ด
- ตอบ: ได้คำยืนยันว่าถูกต้อง หากผิดก็จะได้รับคำแนะนำ
3.5 มีข้อควรระวังอะไรในการใช้ AI ช่วยเขียนโปรแกรม
- ตอบ: คัดลอกมาวางเลย โดยที่ไม่ทำความเข้าใจ

ให้นักศึกษาตอบคำถามต่อไปนี้
1. ส่วนใดของ Java ที่นักศึกษายังไม่มั่นใจมากที่สุด
ตอบ: Array ที่มี Mrthod ชับช้อน

2. โจทย์ข้อใดยากที่สุด เพราะเหตุใด
ตอบ: ข้อ 9 เพราะต้องไล่ดูทีละบรรทัด

3. การทบทวน Java ครั้งนี้ช่วยเตรียมตัวเรียน Algorithm อย่างไร
ตอบ: ช่วยให้จำรูปแบบคำสั่งเงื่อนไข โครงสร้างการทำงาน และการวนลูปเพื่อจัดการข้อมูลใน Array ได้ดีขึ้น

4. นักศึกษาคิดว่า Java ส่วนใดสำคัญที่สุดต่อการเรียน Algorithm
ตอบ: Loop Array

5. นักศึกษาจะฝึกเพิ่มเติมเรื่องใดก่อนเรียนสัปดาห์ถัดไป
ตอบ: Array
