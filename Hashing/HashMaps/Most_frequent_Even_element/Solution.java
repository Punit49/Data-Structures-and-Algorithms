import java.util.*;
class Solution {
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int mostFrequentElement = -1;
        int maxFrequency = 0;

        for(int n: nums){
            if(n % 2 == 0){
                freq.put(n, freq.getOrDefault(n, 0) + 1);
            }
        }
        
        for(int key: freq.keySet()){
            int val = freq.get(key);
            if(val > maxFrequency){
                maxFrequency = val;
                mostFrequentElement = key;
            } else if(val == maxFrequency && key < mostFrequentElement){
                mostFrequentElement = key;
            }
        } 

        return mostFrequentElement;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(nums1)); 
    }
}

// TC - O(N)
// SC - O(N)

// LC - 2404 - https://leetcode.com/problems/most-frequent-even-element/description/