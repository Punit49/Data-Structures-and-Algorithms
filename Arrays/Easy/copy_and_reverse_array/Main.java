import java.util.Arrays;

public class Main {
    public static int[] getCopyReversedArr(int[] arr){
        int[] copyArr = new int[arr.length];
        for(int i = 0; i < copyArr.length; i++){
            copyArr[i] = arr[arr.length - i - 1];
        }
        return copyArr;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 45, 66, 32};
        int[] copiedArr = getCopyReversedArr(arr);
        System.out.println(Arrays.toString(copiedArr));
    }
}

// we can also maintain a variable(y) which starts with arr.length - 1;
// and temp[i] = arr[y]
// y--;