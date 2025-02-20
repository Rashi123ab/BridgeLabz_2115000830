import java.util.*;
public class Generate{
    public static ArrayList<String> generateBinaryNumbers(int N) {
        ArrayList<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 0; i < N; i++) {
            String current = queue.poll();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int N = sc.nextInt();
        ArrayList<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println("First " + N + " Binary Numbers:");
        System.out.println(binaryNumbers);
    }
}

