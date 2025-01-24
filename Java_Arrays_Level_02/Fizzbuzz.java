import java.util.*;
public class Fizzbuzz {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.print("positive integer: ");
int num = sc.nextInt();
if (num <= 0) {
System.out.println("Error: Not a positive integer.");
return;
}
String[] ans = new String[num + 1];
for (int i = 0; i <= num; i++) {
if (i % 3 == 0 && i % 5 == 0) {
ans[i] = "FizzBuzz";
}else if (i % 3 == 0) {
ans[i] = "Fizz";
}else if (i % 5 == 0) {
ans[i] = "Buzz";
}else {
ans[i] = String.valueOf(i);
}
}
for (int i = 0; i <= num; i++) {
System.out.println("Position " + i + " = " + ans[i]);
}
}
}
