public class Solution{
    public static long absoluteDiff(int[] arr){
        long sum = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                sum += arr[j] - arr[i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        System.out.println(absoluteDiff(arr));
    }
}