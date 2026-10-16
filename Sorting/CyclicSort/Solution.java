import java.util.Arrays;

class Solution {
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            } else i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 3, 5, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// Complexity
// - Time: (O(n)) for this constrained input.
// - Space: (O(1)) auxiliary space.