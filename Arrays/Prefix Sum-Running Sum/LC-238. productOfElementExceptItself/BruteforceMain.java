import java.util.Arrays;

class BruteforceMain {
    public static int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    arr[i] *= nums[j];
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 0, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}

// TC - O(n^2) 
// SC - O(n)
// LeetCode - 238 - https://leetcode.com/problems/product-of-array-except-self/description/ 