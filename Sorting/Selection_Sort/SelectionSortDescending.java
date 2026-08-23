import java.util.Arrays;

public class SelectionSortDescending{
    static int[] selectionSortDesc(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            int max = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }

            if(i != max){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 9, -8, -14, 145, 39};
        System.out.println(Arrays.toString(selectionSortDesc(arr, arr.length)));
    }
}