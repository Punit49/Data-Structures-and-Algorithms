public class Row_with_maximum_sum{
    public static void main(String[] args) {
        int[][] arr = {
            {1, 290, 73},
            {44, 50, 61},
            {7, 408, 9},
        };

        int rowSum = 0;
        int row = -1;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            if(sum > rowSum){
                rowSum = sum;
                row = i;
            }
        }

        System.out.println(row);
    }
}