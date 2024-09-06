import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Add element at a specific index
        list.add(1, 15);

        // Get element at a specific index
        list.get(2);

        // Set element at a specific index
        list.set(2, 25);

        // Remove element at a specific index
        list.remove(3);

        // Remove a specific element
        list.remove(Integer.valueOf(15));

        // Check if an element exists
        list.contains(10);

        // Get size of the ArrayList
        list.size();

        // Check if ArrayList is empty
        list.isEmpty();

        // Clear all elements from the ArrayList
        list.clear();

        // Sort the ArrayList
        Collections.sort(list);

        // Reverse the ArrayList
        Collections.reverse(list);
    }
}
