// lC - 74. Search a 2D Matrix - https://leetcode.com/problems/search-a-2d-matrix/
public class Optimized {
    public static boolean binarySearch(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = (m * n) - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target) return true;
            else if(target > matrix[row][col]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;        
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {18, 25, 28, 30, 35},
            {38, 41, 45, 47, 50}
        };

        int target = 40;
        System.out.println(binarySearch(matrix, target));
    }
}

// TC - O(log(m * n))
// SC - O(1)