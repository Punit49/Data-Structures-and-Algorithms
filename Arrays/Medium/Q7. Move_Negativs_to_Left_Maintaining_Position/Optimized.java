import java.util.Arrays;

public class Optimized {
    public static int[] moveNegatives(int[] arr){
        int n = arr.length; 
        int[] newArr = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                newArr[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, -6, -7, 8};
        System.out.println(Arrays.toString(moveNegatives(arr)));
    }
}
