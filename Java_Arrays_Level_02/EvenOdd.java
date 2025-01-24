import java.util.*;
public class EvenOdd{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter a natural number: ");
int num = sc.nextInt();
if (num<= 0) {
System.out.println("Error: Not a natural number.");
return;
}
int[] evenNum = new int[num / 2 + 1];
int[] oddNum= new int[num/ 2 + 1];
int evenIndex = 0, oddIndex = 0;
for (int i = 1; i <= num; i++) {
if (i % 2 == 0) {
evenNum[evenIndex++] = i;
}else {
oddNum[oddIndex++] = i;
}
}
System.out.print("Odd numbers: ");
for (int i = 0; i < oddIndex; i++) {
System.out.print(oddNum[i] + " ");
}
System.out.println();
System.out.print("Even numbers: ");
for (int i = 0; i < evenIndex; i++) {
System.out.print(evenNum[i] + " ");
}
}
}
