import java.util.*;
public class LeapYear2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Y=sc.nextInt();
        if (Y < 1582) {
            System.out.println("The year is before the Gregorian calendar was introduced.");
        }
        if (Y % 4 == 0) {
            if (Y % 100 == 0) {
                if (Y % 400 == 0) {
                    System.out.println(Y+" is a Leap Year.");
                } else {
                    System.out.println(Y+" is NOT a Leap Year.");
                }
            } else {
                    System.out.println(Y+" is a Leap Year.");
            }
        } else {
              System.out.println(Y+" is NOT a Leap Year.");
        }
     }
}
