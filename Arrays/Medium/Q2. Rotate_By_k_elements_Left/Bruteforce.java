import java.util.Arrays;
import java.util.Scanner;

public class Bruteforce {
    public static int[] rotateByK(int[] arr, int k){
        if(arr.length == k) return arr;
        if(k > arr.length){
            k -= arr.length;
        }
        int count = 0;
        for(int i = 1; i <= k; i++){
            int firstVal = arr[0];
            count++;
            for(int j = 1; j < arr.length; j++){
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = firstVal;
        }
        System.out.println(count);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int k = sc.nextInt();
        int[] rotatedArr = rotateByK(arr, k);
        System.out.println(Arrays.toString(rotatedArr));
    }
}
