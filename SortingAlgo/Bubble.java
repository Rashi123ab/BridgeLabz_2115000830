import java.util.*;
public class Bubble {
    public static void Bubblesort(int[] marks) {
        int n = marks.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap= false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    swap=true;
                }
            }
            if (!swap) break;
        }
    }
    public static void main(String[] args) {
        int[] marks = {5, 3, 8, 4, 2};
        Bubblesort(marks);
        System.out.println(Arrays.toString(marks));
    }
}
