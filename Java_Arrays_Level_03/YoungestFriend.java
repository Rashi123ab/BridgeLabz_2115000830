import java.util.Scanner;
public class YoungestFriend{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Ages = new int[3];//Age Array
        int[] heights = new int[3];//Heights Array
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input 
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            Ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }//youngest friend
        int minAge = Ages[0];
        String youngestFriend = names[0];

        for (int i = 1; i < 3; i++) {
            if (Ages[i] < minAge) {
                minAge = Ages[i];
                youngestFriend = names[i];
            }
        }//tallest friend
        int maxHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + minAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + maxHeight + " cm");
    }
}
