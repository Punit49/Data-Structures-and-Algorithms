import java.util.Arrays;

public class BubbleSortDescending{
    static int[] bubbleSort(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            
            if(!isSwapped) break;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {10, 2, 9, -8, 19, 14, 1, -3};
        System.out.println(Arrays.toString(bubbleSort(arr, arr.length)));
    }
}