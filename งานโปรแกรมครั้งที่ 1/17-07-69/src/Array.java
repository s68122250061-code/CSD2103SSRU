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