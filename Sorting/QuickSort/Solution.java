import java.util.Arrays;

class Solution {
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        } 
    } 
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int idx = low - 1;
        int pivot = arr[high];
        
        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                idx++;
                swap(arr, j, idx);
            }
        }
        
        idx++;
        swap(arr, idx, high);
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 60, 5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}