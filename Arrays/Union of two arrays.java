/*Given two arrays arr1[] and arr2[], the task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.

Note: Elements are not necessarily distinct.

Examples

Input: arr1[] = [1, 2, 3, 4, 5], arr2[] = [1, 2, 3]
Output: 5
Explanation: 1, 2, 3, 4 and 5 are the elements which comes in the union setof both arrays. So count is 5.*/

class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        HashSet<Integer> arr = new HashSet<>();
        
        for(int nums:arr1){
            arr.add(nums);
        }
        for(int nums:arr2){
            arr.add(nums);
        }
        int j = 0;
        int[] res = new int[arr.size()];
        
        for(int x:arr){
            res[j++] = x;
        }
        return res.length;
       
    }
}
Approach : use hashset .
