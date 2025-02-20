import java.util.*;
public class Operations{
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        removeDuplicates(numbers);
        System.out.println(numbers);
    }
    public static void removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (seen.add(num)) {
                result.add(num);
            }
        }
        list.clear();
        list.addAll(result);
    }
}

