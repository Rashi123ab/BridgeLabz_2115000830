import java.util.Random;
class SortingComparison {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }
    static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, h);
        }
    }
    static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random r = new Random();
        for (int n : sizes) {
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int[] arr3 = new int[n];
            for (int i = 0; i < n; i++) {
                int val = r.nextInt();
                arr1[i] = arr2[i] = arr3[i] = val;
            }
            long start, end;
            if (n <= 10000) {
                start = System.currentTimeMillis();
                bubbleSort(arr1);
                end = System.currentTimeMillis();//time in ms
                System.out.println("Bubble Sort (Size=" + n + "): " + (end - start) + "ms");
            }
            start = System.currentTimeMillis();
            mergeSort(arr2, 0, n - 1);
            end = System.currentTimeMillis();
            System.out.println("Merge Sort (Size=" + n + "): " + (end - start) + "ms");
            start = System.currentTimeMillis();
            quickSort(arr3, 0, n - 1);
            end = System.currentTimeMillis();
            System.out.println("Quick Sort (Size=" + n + "): " + (end - start) + "ms");
        }
    }
}
