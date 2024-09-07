/*
Given an array arr of positive integers and another number x. Determine whether two elements exist in arr whose sum is exactly x or not. Return a boolean value true if two elements exist in arr else return false.

Examples:

Input: x = 16, arr[] = [1, 4, 45, 6, 10, 8]
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16
Input: x = 11, arr[] = [1, 2, 4, 3, 6]
Output: false
Explanation: None of the pair makes a sum of 11
*/


class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==x){
                return true;
               
            }
            else if(sum>x){
                right--;
            }
            else{
                left++;
            }
            
        }
        return false;
    }
}


//Approach: we can solve this question using hashmap and two pointers . first sort the array and check for the sum using two pointers while push the pointers accordingly
