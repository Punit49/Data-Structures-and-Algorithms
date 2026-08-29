import java.util.Arrays;

public class Better{
    static int[][] setZeroes(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for(int i = 0; i < row.length; i++){
            for(int j = 0; j < col.length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < row.length; i++){
            for(int j = 0; j < col.length; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 1, 1}
        };
        System.out.println(Arrays.deepToString(setZeroes(matrix)));
    }
}

