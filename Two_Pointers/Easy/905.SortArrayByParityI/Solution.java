import java.util.Arrays;

public class Solution {
    public static int[] sortedArrayByParity(int[] nums){
        int i = 0;
        int j = 0;

        while(i < nums.length){
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,4, 10, 2, 3, 11, 19, 20};
        System.out.println(Arrays.toString(sortedArrayByParity(nums)));
    }
}

// TC - O(n) 
// SC - O(1)  
// 905. Sort Array By Parity I - https://leetcode.com/problems/sort-array-by-parity/