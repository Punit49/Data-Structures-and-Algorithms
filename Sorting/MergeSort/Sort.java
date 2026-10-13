import java.util.Arrays;

class Sort {
    static void merge(int arr[], int start, int mid, int end){
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        } 
        while(j <= end){
            temp[k++] = arr[j++];
        }
        int l = start;
        for(i = 0; i < temp.length; i++){
            arr[l++] = temp[i];
        }
    }
    public static void mergeSort(int arr[], int start, int end) {
        if(start >= end) return;
        int mid = start + (end - start) / 2;
        
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}