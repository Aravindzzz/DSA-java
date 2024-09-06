
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // 1. put(K key, V value): Adds a key-value pair to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("After putting key-value pairs: " + map);

        // 2. get(Object key): Returns the value associated with the specified key
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // 3. remove(Object key): Removes the key-value pair associated with the specified key
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 4. containsKey(Object key): Checks if the map contains the specified key
        boolean hasKey = map.containsKey(1);
        System.out.println("Contains key 1: " + hasKey);

        // 5. containsValue(Object value): Checks if the map contains the specified value
        boolean hasValue = map.containsValue("Apple");
        System.out.println("Contains value 'Apple': " + hasValue);

        // 6. keySet(): Returns a set of all the keys in the map
        System.out.println("Keys in the map: " + map.keySet());

        // 7. values(): Returns a collection of all the values in the map
        System.out.println("Values in the map: " + map.values());

        // 8. entrySet(): Returns a set of all key-value pairs
        System.out.println("Key-value pairs in the map: " + map.entrySet());

        // 9. size(): Returns the number of key-value pairs in the map
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // 10. isEmpty(): Checks if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is the map empty: " + isEmpty);

        // 11. clear(): Removes all key-value pairs from the map
        map.clear();
        System.out.println("After clearing the map: " + map);
    }
}
