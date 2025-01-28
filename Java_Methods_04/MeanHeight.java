import java.util.*;
public class MeanHeight{
    public static int findSum (int[] arr){
        int sum =0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
//finding the mean height of player
    public static double findMean(int sum, int count){
        double mean = (double) sum/count;
        return mean;
    }
    public static int findShortest(int[] arr){
        int shortHeight = arr[0];
        for(int num:arr){
            if(num < shortHeight){
                shortHeight = num;
            }
        }
        return shortHeight;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr){
        int tall = arr[0];
        for(int num:arr){
            if(num > tall){
                tall = num;
            }
        }
        return tall;
    }

    public static void main(String args[]){
        int heights[] = new int[11];
        Random random = new Random();
        for(int i=0;i<heights.length;i++){
            heights[i] = 150 + random.nextInt(101);
        }
        System.out.println("Heights of players : ");
        for(int height : heights){
            System.out.print(height + " ");
        }
        System.out.print("");

        System.out.println("Sum of heights: " + findSum(heights) + " cms ");
        System.out.println("Mean height: " + findMean(findSum(heights), heights.length) + " cms ");
        System.out.println("Shortest height: " + findShortest(heights) + " cms ");
        System.out.println("Tallest height: " + findTallest(heights) + " cms ");
    }
}
