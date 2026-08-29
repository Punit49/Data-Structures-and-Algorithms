// Leetcode Q - 832 - https://leetcode.com/problems/flipping-an-image/description/
import java.util.Arrays; 

class Solution {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        
        for(int i = 0; i < n; i++){
            int start = 0;
            int end = n - 1;
            int[] arr = image[i]; // just storing reference

            while(start < end){
                int temp = arr[end] ^= 1;
                arr[end] = arr[start] ^= 1;
                arr[start] = temp;
                start++;
                end--;
            }
            
            if(start == end){ // if start == end then coz of this condition - start < end, the element at start which must be inverted. 
                arr[start] ^= 1;
            }
        }

        return image;
    }

    public static void main(String[] args){
        int[][] arr = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0},
        };

        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
}