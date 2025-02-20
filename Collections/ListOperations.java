import java.util.*;
class ListOperations{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int rotateBy = 2;
        rotateList(numbers, rotateBy);
        System.out.println(numbers);
    }
    public static void rotateList(List<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size;
        List<Integer> temp = new ArrayList<>(list.subList(positions, size));
        temp.addAll(list.subList(0, positions));
        list.clear();
        list.addAll(temp);
    }
}
