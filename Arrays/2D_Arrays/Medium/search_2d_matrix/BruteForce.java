public class BruteForce {
    public static boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length;
       int n = matrix[0].length;
       int i = 0;
       int j = n - 1;

       while(i < m && j >= 0){
        if(matrix[i][j] < target) i++; 
        else if(matrix[i][j] > target) j--;  
        else return true;
       }

       return false; 
    }

    public static void main(String[] args){
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {18, 25, 28, 30, 35},
            {38, 41, 45, 47, 50}
        };
        int target = 47;

        System.out.println(searchMatrix(matrix, target));
    }
}