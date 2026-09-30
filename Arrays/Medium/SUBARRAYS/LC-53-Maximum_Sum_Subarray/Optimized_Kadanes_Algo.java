public class Optimized_Kadanes_Algo {
    public static int kadanesAlgorithm(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(sum < 0) sum = 0;
            sum += arr[i];
            max = Math.max(sum, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 5,4,-1,7,8};
        System.out.println(kadanesAlgorithm(arr));;
    }
}

// TC - O(n)
// SC - O(1)
// LC - 53. Maximum Subarray - https://leetcode.com/problems/maximum-subarray/description/