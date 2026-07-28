public class AlgorithmBenchmark {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};
        int runs = 5;

        System.out.println("Data Size (n)\tBrute Force (ns)\tBinary Search (ns)\tTwo-Pointer Iterative (ns)");

        for (int n : sizes) {
      
            int[] data = new int[n];
            for (int i = 0; i < n; i++) data[i] = i * 2;
            int k = -1; 

        
            long timeBF = 0;
            if (n <= 10000) {
                long total = 0;
                for (int r = 0; r < runs; r++) {
                    long start = System.nanoTime();
                    TwoSumSorted.findPairBruteForce(data, k);
                    long end = System.nanoTime();
                    total += (end - start);
                }
                timeBF = total / runs;
            }

         
            long totalBS = 0;
            for (int r = 0; r < runs; r++) {
                long start = System.nanoTime();
                TwoSumSorted.findPairBinarySearch(data, k);
                long end = System.nanoTime();
                totalBS += (end - start);
            }
            long timeBS = totalBS / runs;

          
            long totalTP = 0;
            for (int r = 0; r < runs; r++) {
                long start = System.nanoTime();
               
                int l = 0, right = data.length - 1;
                while (l < right) {
                    int sum = data[l] + data[right];
                    if (sum == k) break;
                    if (sum < k) l++; else right--;
                }
                long end = System.nanoTime();
                totalTP += (end - start);
            }
            long timeTP = totalTP / runs;

            System.out.println(n + "\t\t" + (n > 10000 ? "N/A" : timeBF) + "\t\t" + timeBS + "\t\t" + timeTP);
        }
    }
}