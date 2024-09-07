/*
Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
Output: [0, 2, 2, 0, 1]
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 2 times. 3 occurring 2 times. 4 occurring 0 times. 5 occurring 1 time, all the modifications done in the same given arr[].
  */


class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
       int k = 0;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           Integer element = arr[i];
          if(map.containsKey(element)){
              map.put(element,map.get(element)+1);
          }
          else{
              map.put(element,1);
          }
       }
          for(int i=1;i<=arr.length;i++){
              arr[k++]= map.getOrDefault(i, 0); 
          }
           
       }
    }

//Approach - use hashmap to record the frequencies and use the getOrDefault(i,0) to put it into the resultant array (the key values)
