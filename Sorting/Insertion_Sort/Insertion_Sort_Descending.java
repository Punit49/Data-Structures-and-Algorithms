import java.util.Arrays;

public class Insertion_Sort_Descending{
    static int[] insertionSort(int[] arr, int n){
        for(int i = 1; i < n; i++){
            int cur = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] < cur){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = cur;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, -9, -2, 19, 21, 3, -14};
        System.out.println(Arrays.toString(insertionSort(arr, arr.length)));
    }
}
