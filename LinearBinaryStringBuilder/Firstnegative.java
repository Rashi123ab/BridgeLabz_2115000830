public class Firstnegative {
    public static int find(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, -4, 5, -9};
        System.out.println(find(arr));
    }
}
