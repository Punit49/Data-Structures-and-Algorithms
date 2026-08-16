import java.util.Arrays;

public record Main() {
    public static void main(String[] args){
        int[] arr = {-5, -4, 40, 12, -43, -2, 3, -1, 2};
        int j = arr.length - 1;

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] < 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
