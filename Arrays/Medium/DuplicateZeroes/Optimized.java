import java.util.Arrays;

public class Optimized {
    public static int[] duplicateZeroes(int[] arr){
        int count = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0) count++;
        }

        int i = n - 1;
        int j = n - 1 + count;

        while(i != j){
            if(j < n){
                arr[j] = arr[i];
            }
            j--;
            if(arr[i] == 0){
                if(j < n){
                    arr[j] = arr[i];
                }
                j--;
            }
            i--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 0, 4, 8};
        System.out.println(Arrays.toString(duplicateZeroes(arr)));
    }
}

// Time - O(n)
// Space - O(n)
// Leetcode - 1089 Duplicate Zeros - https://leetcode.com/problems/duplicate-zeros/description/