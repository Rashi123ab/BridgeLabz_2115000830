import java.util.*;
public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int greatestFactor = 1;

        for (int i = num- 1; i >= 1; i--) {
            if (num% i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + num + " beside itself is: " + greatestFactor);

    }
}

