import java.util.Arrays;

public class EvenOddPartition {

    // อัลกอริทึมที่ 1: Recursive Two-Pointer
    public static void rearrangeRecursive(int[] a, int left, int right) {
        if (left >= right) return; // Base Case

        if (a[left] % 2 == 0) {
            rearrangeRecursive(a, left + 1, right);
        } else if (a[right] % 2 != 0) {
            rearrangeRecursive(a, left, right - 1);
        } else {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            rearrangeRecursive(a, left + 1, right - 1);
        }
    }

    // อัลกอริทึมที่ 2: Iterative Two-Pointer
    public static void rearrangeTwoPointer(int[] a) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            while (left < right && a[left] % 2 == 0) left++;
            while (left < right && a[right] % 2 != 0) right--;
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }

    // อัลกอริทึมที่ 3: Extra Array (Stable Algorithm)
    public static int[] rearrangeExtraArray(int[] a) {
        int[] result = new int[a.length];
        int index = 0;
        for (int val : a) {
            if (val % 2 == 0) result[index++] = val;
        }
        for (int val : a) {
            if (val % 2 != 0) result[index++] = val;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 2, 9, 4, 1, 6, 3, 8};
        rearrangeTwoPointer(arr1);
        System.out.println("Input: " + "[7, 2, 9, 4, 1, 6, 3, 8], [5, 2, 7, 4, 9, 6]");
        System.out.println("Two-Pointer Output: " + Arrays.toString(arr1));

        int[] arr2 = {5, 2, 7, 4, 9, 6};
        int[] stableResult = rearrangeExtraArray(arr2);
        System.out.println("Stable Output:      " + Arrays.toString(stableResult));
    }
}