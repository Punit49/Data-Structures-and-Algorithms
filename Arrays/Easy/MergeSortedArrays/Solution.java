import java.util.Arrays;

public class Solution{
    public static int[] merge(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        for(int k = 0; k < merged.length; k++){
            if(i < arr1.length && j < arr2.length){
                if(arr1[i] < arr2[j]){
                    merged[k] = arr1[i++];
                } else {
                    merged[k] = arr2[j++];
                }
            } else if(i < arr1.length){
                merged[k] = arr1[i++];
            } else {
                merged[k] = arr2[j++];
            }
        }
        return merged;
    }
    public static void main(String[] args) {
        int[] arr2 = {3, 5, 8};
        int[] arr1 = {1, 4, 7, 9, 19, 21};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}

// Time: O(m + n)
// Extra space: O(m + n)