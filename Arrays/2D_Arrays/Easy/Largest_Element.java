public class Largest_Element{
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 50, 6},
            {7, 8, 9},
        };

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int val = arr[i][j];
                if(val > max){
                    max = val;
                }
            }
        }

        System.out.println(max);
    }
}