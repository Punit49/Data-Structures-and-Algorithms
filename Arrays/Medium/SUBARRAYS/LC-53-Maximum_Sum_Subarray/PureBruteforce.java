class PureBruteforce {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += nums[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr ={2, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}

// TC - O(n^3)
// SC - O(1)
// LC - 53. Maximum Subarray - https://leetcode.com/problems/maximum-subarray/description/