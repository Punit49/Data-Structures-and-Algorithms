import java.util.Arrays;

public class Main {
    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 34, 56, 29, 99, 22};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
