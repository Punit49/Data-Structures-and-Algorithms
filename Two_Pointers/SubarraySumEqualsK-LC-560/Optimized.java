// Works for Positives only
class Optimized {
    public static int subarraySum(int[] nums, int k) {
        int sum = nums[0];
        int n = nums.length;
        int left = 0, right = 0;
        int subarrayCount = 0;

        while(right < n){
            while(left <= right && sum > k){
                sum -= nums[left++];
            }
            if(sum == k) subarrayCount++;
            right++;
            if(right < n){
                sum += nums[right];
            }
        }

        return subarrayCount;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, 10};
        int k = 15;
        System.out.println(subarraySum(arr, k));
    }
}

// Time - O(n)
// Space - O(1)
// LC - 560. Subarray Sum Equals K -> https://leetcode.com/problems/subarray-sum-equals-k/description/