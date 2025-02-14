import java.util.*;
public class Insertion{
    public static void insertionSort(int[] employeeid) {
        int n = employeeid.length;
        for (int i = 1; i < n; i++) {
            int key = employeeid[i];
            int j = i - 1;
             while (j >= 0 && employeeid[j] > key) {
                employeeid[j + 1] = employeeid[j];
                j--;
            }
            employeeid[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeid = {3, 7, 8, 4, 1};
        insertionSort(employeeid);
        System.out.println(Arrays.toString(employeeid));
    }
}
