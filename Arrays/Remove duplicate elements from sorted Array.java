/*Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array such that all the distinct elements come at the beginning of the original array.

Examples :

Input: arr = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return 1 after modifying the array, the driver code will print the modified array elements.
Input: arr = [1, 2, 4]
Output: [1, 2, 4]
Explation:  As the array does not contain any duplicates so you should return 3.*/


class Solution {
    // Function to remove duplicates from the given list in place
    public int remove_duplicate(List<Integer> arr) {
        int current = Integer.MAX_VALUE;
        int index = 0; // To track the position to insert the next unique element
        
        for (int x : arr) {
            if (x != current) {
                current = x;
                arr.set(index++, x); // Place unique element at the correct position
            }
        }

        // Trim the list to the correct size (in case of extra elements at the end)
        while (arr.size() > index) {
            arr.remove(arr.size() - 1); // Remove excess elements from the end
        }

        return index; // Return the size after removing duplicates
    }
}



Approch - just use arraylist and trim the resultant array if extra is there
