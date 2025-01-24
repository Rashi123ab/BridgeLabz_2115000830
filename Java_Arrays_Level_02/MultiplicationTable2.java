import java.util.*;
public class MultiplicationTable2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
int[]Result = new int[4];
for (int i = 6; i <= 9; i++) {
Result[i - 6] = num * i;
} //Displaying result
for (int i = 6; i <= 9; i++) {
System.out.println(num + " * " + i + " = " + Result[i - 6]);
}
}
}
