import java.util.Arrays;

class Solution {
    public static int[] moveZerosToEnd(int[] arr) {
        int i = 0;
        int j = 0;

        while(i < arr.length){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 3, 4, 0, 0, 5};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }
}

// TC - O(n) 
// SC - O(1) 
// LeetCode - Q283 - https://leetcode.com/problems/move-zeroes/