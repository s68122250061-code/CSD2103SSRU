public class StringReversal {
    // อัลกอริทึมที่ 1: Recursive Algorithm
    public static String reverseRecursive(String s) {
        if (s == null || s.length() <= 1) {
            return s; // Base Case
        }
        // Recursive Case: ตัวสุดท้าย + ผลลัพธ์สตริงส่วนที่เหลือ
        return s.charAt(s.length() - 1) + reverseRecursive(s.substring(0, s.length() - 1));
    }
    // อัลกอริทึมที่ 2: Iterative Algorithm
    public static String reverseIterative(String s) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "pots&pans";
        System.out.println("Input:  " + str1);
        System.out.println("Output (Recursive): " + reverseRecursive(str1));
        System.out.println("Output (Iterative): " + reverseIterative(str1));
        System.out.println();
    }
}
