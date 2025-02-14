import java.util.Arrays;
public class ExamScores{
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] scores = {80,62,90,75,88,70};
        selectionSort(scores);
        System.out.println(Arrays.toString(scores));
    }
}
