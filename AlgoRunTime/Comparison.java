import java.util.Arrays;
import java.util.Random;
public class Comparison{
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random rand = new Random();
        for (int s : sizes) {
            int[] data = new int[s];
            for (int i = 0; i < s; i++) {
                data[i] = rand.nextInt(s * 10);//selecting any random no. from datasets
            }
            int target = data[rand.nextInt(s)];
            long startTime = System.nanoTime(); //calculating execution time
            linearSearch(data, target);
            long linearTime = System.nanoTime()-startTime;
            Arrays.sort(data);
            startTime = System.nanoTime();
            binarySearch(data, target);
            long binaryTime = System.nanoTime() - startTime;
            System.out.println("Dataset Size: " + s);
            System.out.println("Linear Search Time: " + linearTime / 1000000.0 + " ms");//converting search time in millisec.
            System.out.println("Binary Search Time: " + binaryTime / 1000000.0 + " ms");
        }
    }
    public static int linearSearch(int[] arr, int target) {//linear search algorithm
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {//Binary Search Algorithm
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

