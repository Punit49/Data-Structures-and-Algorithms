// LC - 48 - https://leetcode.com/problems/rotate-image/description/

import java.util.Arrays;

public class Solution{
    static int[][] rotateImage(int[][] matrix, int n){
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

            int start = 0;
            int end = n - 1;
            int[] arr = matrix[i];

            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(rotateImage(matrix, matrix.length)));
    }
}

