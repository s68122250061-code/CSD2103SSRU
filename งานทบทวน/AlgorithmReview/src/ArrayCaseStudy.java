public class ArrayCaseStudy {
    public static void main(String[] args) {
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int totalScore = 0;
        int maxScore = scores[0];
        int minScore = scores[0];
        int passedCount = 0;

        for (int score : scores) {
            totalScore += score;

            if (score > maxScore) {
                maxScore = score;
            }

            if (score < minScore) {
                minScore = score;
            }

            if (score >= 7) {
                passedCount++;
            }
        }

        double averageScore = totalScore / scores.length;

        System.out.println("1.TotalScore        : " + totalScore + " points ");
        System.out.println("2.AverageScore      : " + averageScore + " points ");
        System.out.println("3.MaxScore          : " + maxScore + " points ");
        System.out.println("4.MinScore          : " + minScore + " points ");
        System.out.println("5.7 points or more  : " + passedCount + " people ");
        System.out.print("6.Students who got lower than 5  : ");

        boolean first = true;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print("NO " + (i + 1) + " score " + scores[i] + " points ");
                first = false;
            }
        }
        System.out.println();
    }
}
