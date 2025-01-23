import java.util.*;
public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the starting value for the countdown
        int counter = sc.nextInt();
        while (counter >= 1) {
            // current countdown number
            System.out.println(counter);

            // Decrementing the counter
            counter--;
        }
    }
}
