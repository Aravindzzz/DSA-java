/*Given an array Arr consisting of N distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 
Example 1:

Input: 
N = 4 
arr[] = {1, 5, 3, 2}
Output: 2 
Explanation: There are 2 triplets:
 1 + 2 = 3 and 3 +2 = 5 */

class Solution {
    int countTriplet(int arr[], int n) {
        int triplets = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i==0 || i>0 && arr[i]!=arr[i-1]){
                for(int j=i+1;j<arr.length-1;j++){
                    if(j==i+1 || j>i+1 && arr[j]!=arr[j-1]){
                        // int left = j+1;
                        int right = arr.length-1;
                        int sum = arr[i]+arr[j];
                        while(right>j){
                            if(arr[right]==sum){
                                triplets++;
                                // while(left<right && arr[left]==arr[left+1])left++;
                                while(right>j && arr[right]==arr[right-1]) right--;
                                // left++;
                                right--;
                            }
                            else if(arr[right]>sum){
                                right--;
                            }
                            else{
                                break;
                            }
                            
                        }
                        
                    }
                }
                
            }
        }
        return triplets;
      
    }
}




Approach : Sort first , same like 3 sum but here you are going to use only one pointer right and  the 2 i and j are fixed to check the sum of i and j equals to right pointer

