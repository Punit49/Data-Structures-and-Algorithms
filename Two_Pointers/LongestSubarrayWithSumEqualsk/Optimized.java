// Works for positives only
public class Optimized {
    public static int longestSubarray(int[] nums, int k){
        if (nums.length == 0) return 0;
        int sum = nums[0];
        int n = nums.length;
        int left = 0, right = 0;
        int maxLength = 0;

        while(right < n){
            while(left <= right && sum > k){
                sum -= nums[left++];
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if(right < n){
                sum += nums[right];
            }
        }

        return maxLength;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, 10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}

// Time - O(n), the inner while loop is not gauranted to run always, and it will add up in total iterations. 
// Space - O(1)
// GFG - https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1