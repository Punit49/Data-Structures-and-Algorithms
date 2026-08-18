public class Optimized_Kadanes_Algo {
    public static int kadanesAlgorithm(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i = 0; i < arr.length; i++){
            curSum += arr[i];
            maxSum = Math.max(curSum, maxSum);
            if(curSum < 0){
                curSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -3, -10, -8};
        System.out.println(kadanesAlgorithm(arr));;
    }
}