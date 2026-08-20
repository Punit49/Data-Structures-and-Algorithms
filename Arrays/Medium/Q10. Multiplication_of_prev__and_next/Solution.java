
import java.util.Arrays;

class Solution {
    public static int[] updateArray(int[] arr, int n) {
        if(n == 1) return arr;

        int prev = arr[0];

        for(int i = 0; i < n - 1; i++){
            int current = arr[i];
            arr[i] = prev * arr[i + 1];
            prev = current;
        }

        arr[n - 1] = prev * arr[n - 1];
        
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(updateArray(arr, arr.length)));
    }
}


// Time:  O(n)
// Space: O(1)
