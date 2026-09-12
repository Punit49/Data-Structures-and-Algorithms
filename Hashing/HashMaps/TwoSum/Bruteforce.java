import java.util.Arrays;

class Bruteforce {
    public static  int[] twoSum(int[] arr, int target) {
        int[] sum = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    sum[0] = i; 
                    sum[1] = j; 
                    return sum;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}