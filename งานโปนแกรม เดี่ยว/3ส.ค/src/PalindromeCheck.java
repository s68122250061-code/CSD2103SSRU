public class PalindromeCheck {

  
    public static String preprocess(String s) {
        if (s == null) return "";
    
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }


    public static boolean isPalindromeByReverse(String s) {
        String cleanStr = preprocess(s);
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }

    public static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) {
            return true; 
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false; 
        }
        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        
        System.out.println("Input: " + input);


        System.out.println("Result 1: " + isPalindromeByReverse(input));


        String cleanStr = preprocess(input);
        System.out.println("Result 2: " + isPalindromeRecursive(cleanStr, 0, cleanStr.length() - 1));
    }
}