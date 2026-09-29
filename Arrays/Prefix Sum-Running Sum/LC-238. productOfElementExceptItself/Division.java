import java.util.Arrays;

// using division method 
class Division {
    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zeroCount++;
            else product *= nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 2) nums[i] = 0;
            else if(zeroCount == 1){
                if(nums[i] == 0){
                    nums[i] = product;
                } 
                else nums[i] = 0;
            } else {
                nums[i] = product / nums[i];
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}

// TC - O(n) 
// SC - O(1)
// LeetCode - 238 - https://leetcode.com/problems/product-of-array-except-self/description/ 