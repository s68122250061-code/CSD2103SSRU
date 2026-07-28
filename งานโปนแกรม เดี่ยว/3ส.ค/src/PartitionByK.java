import java.util.Arrays;

public class PartitionByK {

    // อัลกอริทึมที่ 1: Recursive Partition
    public static void partitionRecursive(int[] a, int k, int left, int right) {
        if (left >= right) return;
        if (a[left] <= k) {
            partitionRecursive(a, k, left + 1, right);
        } else if (a[right] > k) {
            partitionRecursive(a, k, left, right - 1);
        } else {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            partitionRecursive(a, k, left + 1, right - 1);
        }
    }

    // อัลกอริทึมที่ 2: Iterative Partition (Lomuto Scheme)
    public static void partitionIterative(int[] a, int k) {
        int i = -1;
        for (int j = 0; j < a.length; j++) {
            if (a[j] <= k) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    // อัลกอริทึมที่ 3: Sorting-Based Algorithm
    public static void partitionBySorting(int[] a, int k) {
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 4, 7, 15, 3, 10, 8};
        partitionIterative(arr1, 8);
        System.out.println("Input: A = [12, 4, 7, 15, 3, 10, 8], k = 8");
        System.out.println("Iterative Partition Result: " + Arrays.toString(arr1));
    }
}