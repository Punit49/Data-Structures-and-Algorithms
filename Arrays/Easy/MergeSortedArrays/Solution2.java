// Merge in place without using new array in O(1) space complexity - 
// LC - 88 - https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;

public class Solution2{
    public static int[] merge(int[] arr1, int m, int[] arr2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = arr1.length - 1; 

        while(i >= 0 && j >= 0){
            if(arr1[i] > arr2[j]){
                arr1[k--] = arr1[i--];
            } else arr1[k--] = arr2[j--];
        }
        while(j >= 0){
            arr1[k--] = arr2[j--];
        }

        return arr1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 9, 19, 21, 0, 0, 0};
        int[] arr2 = {3, 5, 8};
        System.out.println(Arrays.toString(merge(arr1, arr1.length - arr2.length, arr2, arr2.length)));
    }
}

// Time: O(m + n)
// Extra space: O(1)