import java.util.*;

class Solution {
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> uniqueNums = new HashMap<>();
        int sum = 0;

        for(int n: nums){
            uniqueNums.put(n, uniqueNums.getOrDefault(n, 0) + 1);
        }    

        System.out.println(uniqueNums);

        for(int key: uniqueNums.keySet()){
            int val = uniqueNums.get(key);
            if(val == 1) sum += key;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[]arr = {1, 1, 4, 5, 9, 10, 2, 4, 5, 3};
        System.out.println(sumOfUnique(arr));
    }
}

// TC - O(n)
// SC - O(n)

// LC - 1748 - https://leetcode.com/problems/sum-of-unique-elements/description/
