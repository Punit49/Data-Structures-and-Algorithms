import java.util.Arrays;

public class Main{
    public static int[] getConcatenate(int[] arr) {
        int n = arr.length;
        int[] result = new int[n * 2];

        for(int i = 0; i < n; i++){
            result[i] = arr[i];
            result[i + n] = arr[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {18, 69, 83, 45, 41};
        System.out.println(Arrays.toString(getConcatenate(arr)));
    }
}