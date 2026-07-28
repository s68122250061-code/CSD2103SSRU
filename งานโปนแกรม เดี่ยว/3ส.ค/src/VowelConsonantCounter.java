public class VowelConsonantCounter {

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'a' && ch <= 'z' && !isVowel(ch);
    }

    // อัลกอริทึมที่ 1: Recursive Counting
    public static boolean hasMoreVowelsRecursive(String s) {
        if (s == null) return false;
        return countHelper(s, 0, 0, 0);
    }

    private static boolean countHelper(String s, int index, int vCount, int cCount) {
        if (index == s.length()) { // Base Case
            return vCount > cCount;
        }
        char ch = s.charAt(index);
        if (isVowel(ch)) {
            vCount++;
        } else if (isConsonant(ch)) {
            cCount++;
        }
        return countHelper(s, index + 1, vCount, cCount);
    }

    // อัลกอริทึมที่ 2: Iterative Counting
    public static boolean hasMoreVowelsIterative(String s) {
        if (s == null) return false;
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                vCount++;
            } else if (isConsonant(ch)) {
                cCount++;
            }
        }
        return vCount > cCount;
    }

    public static void main(String[] args) {
        String input = "education";
        System.out.println("Input: " + input);
        System.out.println("Recursive Result: " + hasMoreVowelsRecursive(input));
        System.out.println("Iterative Result: " + hasMoreVowelsIterative(input));
    }
}