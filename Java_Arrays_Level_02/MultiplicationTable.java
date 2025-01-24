import java.util.*;
public class MultiplicationTable {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
int[] Table = new int[10];
for (int i=0;i<Table.length; i++) {
Table[i]= num* (i + 1);
}
//displaying the result
for (int i = 0; i < Table.length; i++) {
System.out.println(num + " * " + (i + 1) + " = "+Table[i]);
}
}
}
