import java.util.Arrays;

class Solution2 {
    public static int[] moveZerosToEnd(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }
        for(int i = arr.length - 1; i >= j; i--){
            arr[i] = 0;
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