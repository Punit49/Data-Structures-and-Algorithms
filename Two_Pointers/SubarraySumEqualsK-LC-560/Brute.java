class Brute {
    public static int subarraySum(int[] nums, int k) {
        int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k) maxSum++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {-1, -1, 1};
        int k = 0;
        System.out.println(subarraySum(arr, k));
    }
}

// Time - O(n2)
// Space - O(1)
// LC - 560. Subarray Sum Equals K -> https://leetcode.com/problems/subarray-sum-equals-k/description/