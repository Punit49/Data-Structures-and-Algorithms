import java.util.Arrays;

public class Optimized {
    public static void swap(int arr[], int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1;

        while(i <= k){
            if(nums[i] == 0){
                swap(nums, i, j);
                j++; 
                i++;
            } else if(nums[i] == 2){
                swap(nums, i, k);
                k--;
            } else i++;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}

// Dutch National Flag Algorithm.
// Time Complexity: O(n)  
// Space Complexity- O(1)
// Leetcode - 75. Sort Colors - https://leetcode.com/problems/sort-colors/description/