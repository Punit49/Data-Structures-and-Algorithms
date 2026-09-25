import java.util.Arrays;

class Solution {
    public static int[] replaceElements(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        int n = arr.length;
        int max = arr[n - 1];

        for(int i = n - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max) max = temp;
        }

        arr[n - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(nums)));
    }
}