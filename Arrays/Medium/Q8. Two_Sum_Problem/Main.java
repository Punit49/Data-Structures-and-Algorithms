import java.util.ArrayList;

public class Main {
    public static void main(String[] args){{
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];

                if(sum == target){
                    for(int k = i; k <= j; k++){
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }}
}
