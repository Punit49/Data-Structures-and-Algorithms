import java.util.Arrays;

public class Solution {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] sortedArrayByParity(int[] nums){
        int even = 0;
        int odd = 1;
        int n = nums.length;

        while(even < n && odd < n){
            if(nums[even] % 2 == 1 && nums[odd] % 2 == 0){
                swap(nums, even, odd);
            }
            if(nums[even] % 2 == 0) even += 2;
            if(nums[odd] % 2 == 1) odd += 2;
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 7};
        System.out.println(Arrays.toString(sortedArrayByParity(nums)));
    }
}

// TC - O(n) 
// SC - O(1) 
// 922. Sort Array By Parity II - https://leetcode.com/problems/sort-array-by-parity-ii/description/