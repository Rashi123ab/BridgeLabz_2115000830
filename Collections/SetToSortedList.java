import java.util.*;
public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        ArrayList<Integer> sortedList = new ArrayList<>(hashSet);
        // Sorting the list in ascending order
        Collections.sort(sortedList);
        System.out.println(sortedList);
    }
}
