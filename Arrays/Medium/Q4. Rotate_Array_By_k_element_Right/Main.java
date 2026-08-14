
import java.util.Arrays;


public class Main {
    public static int[] kRotatedArray(int[] arr, int k){
        k = k % arr.length;

        for(int i = 1; i <= k; i++){
            int lastVal = arr[arr.length - 1];
            for(int j = arr.length - 2; j >= 0; j--){
                arr[j + 1] = arr[j];
            }
            arr[0] = lastVal;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 3;
        System.out.println(Arrays.toString(kRotatedArray(arr, k)));
    }
}
