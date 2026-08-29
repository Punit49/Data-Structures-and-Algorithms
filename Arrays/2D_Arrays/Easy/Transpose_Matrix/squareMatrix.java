
import java.util.Arrays;

public class squareMatrix {
    public static int[][] transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length - 1; i++){
            for(int j = i + 1; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        System.out.println(Arrays.deepToString(transpose(arr)));
    }
}