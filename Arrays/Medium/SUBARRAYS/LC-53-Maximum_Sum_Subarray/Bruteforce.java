public class Bruteforce {
    public static int maxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int curSum = 0;
            for(int j = i; j < n; j++){
                curSum += arr[j];
                maxSum = Math.max(curSum, maxSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args){
        int[] arr ={2, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr));
    }
}

// TC - O(n^2)
// SC - O(1)
// LC - 53. Maximum Subarray - https://leetcode.com/problems/maximum-subarray/description/
