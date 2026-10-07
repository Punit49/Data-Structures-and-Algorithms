import java.util.Arrays;

public class Better2 {
    public static void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;

        for(int n: nums){
            if(n == 0) count0++;
            else if(n == 1) count1++;
        }

        for(int i = 0; i < count0; i++) nums[i] = 0;
        for(int i = count0; i < count0 + count1; i++) nums[i] = 1;
        for(int i = count0 + count1; i < nums.length; i++) nums[i] = 2;

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}

// 2-pass counting approach — count first, then overwrite.
// Time Complexity: O(n)  
        // - Counting → O(n)
        // - Filling → O(n)
        // - Total → O(n + n) = O(n)
// Space Complexity- O(1)
// Leetcode - 75. Sort Colors - https://leetcode.com/problems/sort-colors/description/