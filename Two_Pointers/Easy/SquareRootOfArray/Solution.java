import java.util.Arrays;

public class Solution {
    public static int[] sortedArray(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];

        int i = 0;
        int k = n-1;
        int j = n-1;

        while(i <= j){
            int a = nums[i];
            int b = nums[j];
            if(a * a > b * b){
                arr[k--] = a*a;
                i++;
            } else {
                arr[k--] = b*b;
                j--;
            }
        }

        return arr;
    }
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedArray(nums)));
    }
}
