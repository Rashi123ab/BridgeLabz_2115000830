import java.util.*;
public class Multidimensional {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("number of rows: ");
int rows = sc.nextInt();
System.out.print("number of columns: ");
int columns = sc.nextInt();
int[][] matrix = new int[rows][columns];
int[] arr= new int[rows * columns];
int ind = 0;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print("Enter element at (" + i + ", " + j + "): ");
matrix[i][j] = sc.nextInt();
}
}
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
arr[ind++] = matrix[i][j];
}
}
System.out.print("1D Array: ");
for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i] + " ");
}
}
}
