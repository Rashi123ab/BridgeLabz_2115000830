import java.util.*;
public class InvertMap {
    public static <K, V> Map<V, ArrayList<K>> invertMap(Map<K, V> inputMap) {
        Map<V, ArrayList<K>> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);
        Map<Integer, ArrayList<String>> invertedMap = invertMap(inputMap);
        System.out.println(invertedMap);
    }
}
