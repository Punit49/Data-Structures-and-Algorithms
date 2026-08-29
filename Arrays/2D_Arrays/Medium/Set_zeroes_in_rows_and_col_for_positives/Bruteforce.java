
import java.util.Arrays;

public class Bruteforce {

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        if(matrix[i][k] != 0){
                            matrix[i][k] = -1;
                        }
                    }
                    for (int p = 0; p < n; p++) {
                        if(matrix[p][j] != 0){
                            matrix[p][j] = -1;
                        }    
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int q = 0; q < m; q++) {
                if (matrix[i][q] == -1) {
                    matrix[i][q] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}

