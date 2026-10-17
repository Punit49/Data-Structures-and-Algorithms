import java.util.Arrays;

class Solution {
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int findMissing(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIdx = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            } else i++;
        }

        int index = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != index) return index;
            index++;
        }

        return arr.length;
    }
    public static void main(String[] args) {
        // int[] arr = {2, 1, 0};
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissing(arr));
    }
}

// Complexity
// - Time: (O(n)) 
// - Space: (O(1))
// LC - 268 - https://leetcode.com/problems/missing-number/description/