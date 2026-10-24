
import java.util.*;

class Solution2 {
    public static int findDuplicateNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) return Math.abs(nums[i]);
            else nums[index] *= -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicateNumber(arr));
    }
}

// Complexity:
// Time: O(n)
// Space: O(1)
// LC - 287 - https://leetcode.com/problems/find-the-duplicate-number/
