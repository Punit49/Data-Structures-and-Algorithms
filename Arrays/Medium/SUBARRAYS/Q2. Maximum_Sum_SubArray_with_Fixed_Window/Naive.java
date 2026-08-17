public class Naive {
    public static int maxSubarraySum(int[] arr, int w){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i <= arr.length - w; i++){
            int current = 0;

            for(int j = i; j <= i + w - 1; j++){
                current += arr[j];
            }

            max = Math.max(current, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, -2, -5, 10, -3, 6};
        int windowSize = 3;
        System.out.println(maxSubarraySum(arr, windowSize));
    }
}
