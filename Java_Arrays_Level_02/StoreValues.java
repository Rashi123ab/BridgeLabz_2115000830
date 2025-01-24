import java.util.*;
public class StoreValues {
public static void main(String[] args) {
double[] num = new double[10];
double sum = 0.0;
int index = 0;
Scanner sc = new Scanner(System.in);
while(true) {
System.out.print("Enter a number: ");
double input = sc.nextDouble();
if (input <= 0 || index == 10) {
break;
}
num[index] = input;
index++;
}
for (int i = 0; i < index; i++) {
sum += num[i];
}
System.out.println("Numbers entered:");
for (int i = 0; i < index; i++) {
System.out.println(num[i]);
}
System.out.println("Sum: " + sum);
}
}
