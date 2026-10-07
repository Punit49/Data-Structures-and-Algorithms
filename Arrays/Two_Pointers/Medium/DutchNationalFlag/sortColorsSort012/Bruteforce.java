import java.util.Arrays;

public class Bruteforce {
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}

// Time Complexity and Space Complexity- Depends on sorting algorithm being used.
// Leetcode - 75. Sort Colors - https://leetcode.com/problems/sort-colors/description/