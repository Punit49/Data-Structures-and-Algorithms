public class Bruteforce {
    public static int longestSubarray(int[] nums, int k) {
        int maxLength = 0;

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}

// Time - O(n2) 
// Space - O(1)
// GFG - https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1