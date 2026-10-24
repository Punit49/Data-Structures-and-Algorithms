
import java.util.*;

class Solution2 {
    public static List<Integer> findDuplicates(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) return Math.abs(nums[i]);
            else nums[index] *= -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicates(arr));
    }
}

// Complexity:
// Time: O(n)
// Space: O(1), excluding the output list
// LC - 442 - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
