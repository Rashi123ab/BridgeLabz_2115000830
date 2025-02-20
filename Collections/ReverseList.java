import java.util.*;
public class ReverseList{
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(0,7,3,4,5));
        List<Integer> linkedList = new LinkedList<>(arrayList);
        reverseList(arrayList);
        reverseList(linkedList);
        System.out.println(arrayList);
        System.out.println(linkedList);
    }
    public static void reverseList(List<Integer> list) {
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);
            l++;
            r--;
        }
    }
}

