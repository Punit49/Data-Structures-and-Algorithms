import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr[i].length; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}