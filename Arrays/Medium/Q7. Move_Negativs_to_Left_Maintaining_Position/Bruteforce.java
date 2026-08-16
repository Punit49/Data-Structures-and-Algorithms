import java.util.Arrays;

public class Main {
    public static int[] moveNegatives(int[] arr){
        int i = 0, j = 0;

        while(i < arr.length){
            if(arr[i] < 0){
                if(i != j){
                    int k = i;
                    while(k > j){
                        int temp = arr[k];
                        arr[k] = arr[k - 1];
                        arr[k - 1] = temp;
                        k--;
                    }
                }
                j++;
            }
            i++;
        }

        return arr;
    } 
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, -6, -7, 8};
        System.out.println(Arrays.toString(moveNegatives(arr)));
    }
}
