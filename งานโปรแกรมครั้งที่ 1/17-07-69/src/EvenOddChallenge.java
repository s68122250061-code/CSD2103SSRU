import java.util.Scanner;

public class EvenOddChallenge { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
        scanner.close();
    }
}    
