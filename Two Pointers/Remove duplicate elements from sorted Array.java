/*ven a sorted array arr. Return the size of the modified array which contains only distinct elements.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array such that all the distinct elements come at the beginning of the original array.

Examples :

Input: arr = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return 1 after modifying the array, the driver code will print the modified array elements.*/


class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
     int index = 1;
     for(int i=1;i<arr.size();i++){
         if(!arr.get(i).equals(arr.get(i-1))){
             arr.set(index++,arr.get(i));
         }
     }
     while(arr.size()>index){
         arr.remove(arr.size()-1);
     }
     return index;
    }
}

Approach: use two pointers in  arrayList and trime the unwanted errror. 
