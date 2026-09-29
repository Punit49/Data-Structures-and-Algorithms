import java.util.Arrays;

class Bruteforce {
    public static int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int j = i - 1;
            int k = i + 1;
            int leftProduct = 1;
            int rightProduct = 1;

            while(j >= 0){
                leftProduct *= nums[j];
                j--;
            }
            while(k < nums.length){
                rightProduct *= nums[k];
                k++;
            }
            arr[i] = leftProduct * rightProduct;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}

// TC - O(n^2) 
// SC - O(n)
// LeetCode - 238 - https://leetcode.com/problems/product-of-array-except-self/description/ 