import java.util.Arrays;

public class TwoSumSorted {


    public static boolean findPairBruteForce(int[] a, int k) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) return true;
            }
        }
        return false;
    }

    public static boolean findPairRecursive(int[] a, int k, int left, int right) {
        if (left >= right) return false; 
        int sum = a[left] + a[right];
        if (sum == k) {
            System.out.println("Pair found: " + a[left] + " and " + a[right]);
            return true;
        } else if (sum < k) {
            return findPairRecursive(a, k, left + 1, right);
        } else {
            return findPairRecursive(a, k, left, right - 1);
        }
    }


    public static boolean findPairBinarySearch(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            int complement = k - a[i];
            int index = Arrays.binarySearch(a, i + 1, a.length, complement);
            if (index > i) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 11, 15, 20};
        int k = 18;
        System.out.println("Input: a = [2, 4, 7, 11, 15, 20], k = 18");
        findPairRecursive(a, k, 0, a.length - 1);
    }
}