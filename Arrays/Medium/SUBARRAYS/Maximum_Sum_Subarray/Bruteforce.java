public class Bruteforce {
    public static int maxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for(int start = 0; start < n; start++){
            int curSum = 0;
            for(int end = start; end < n; end++){
                curSum += arr[end];
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
