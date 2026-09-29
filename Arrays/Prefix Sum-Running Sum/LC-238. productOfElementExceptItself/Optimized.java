import java.util.Arrays;

public class Optimized {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int suffix = 1;
        int ans[] = new int[n];
        ans[0] = 1;

        for(int i = 1; i < n; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--){
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}

// Time complexity - O(n)
// Space Complexity - O(1) -> ans array is counted in space complexity. 
// LeetCode - 238 - https://leetcode.com/problems/product-of-array-except-self/description/ 
