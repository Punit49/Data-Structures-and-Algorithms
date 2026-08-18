import java.util.Arrays;

public interface Main {
    public static void main(String[] args){{
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0, 1};
        int j = arr.length - 1;

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 0){
                if(i != j){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }}
}
