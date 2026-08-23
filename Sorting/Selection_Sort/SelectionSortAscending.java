import java.util.Arrays;

public class SelectionSortAscending{
    static int[] selectionSortAsc(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            int min = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            if(i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 9, -8, -14, 145, 39};
        System.out.println(Arrays.toString(selectionSortAsc(arr, arr.length)));
    }
}