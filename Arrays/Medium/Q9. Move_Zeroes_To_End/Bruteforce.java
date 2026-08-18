import java.util.Arrays;

public class Bruteforce {
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0, 1};
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            if(arr[i] == 1){
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
