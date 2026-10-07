import java.util.Arrays;

public class Better1 {
    public static void sortColors(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                int temp = nums[j];
                nums[j++] = 0;
                nums[i] = temp;
            }
        }
        for(int i = j; i < nums.length; i++){
            if(nums[i] == 1){
                int temp = nums[j];
                nums[j++] = 1;
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}

// Approach: Two-pass in-place partitioning`
// Time Complexity - O(2n) - O(n)
// Space Complexity- O(1)
// Leetcode - 75. Sort Colors - https://leetcode.com/problems/sort-colors/description/