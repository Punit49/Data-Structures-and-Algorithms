import java.util.Arrays;

public class Main {
    public static int[] rotateArrToRightOneStep(int[] arr){
        int lastVal = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            arr[i + 1] = arr[i];
        }
        arr[0] = lastVal;
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {90, 80, 20, 10, 40, 50};
        int[] rotatedArr = rotateArrToRightOneStep(arr);
        System.out.println(Arrays.toString(rotatedArr));
    }
}
