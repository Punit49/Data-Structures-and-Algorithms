public class Solution {
    public static int removeDuplicates(int[] arr){
        int k = 1;
        int last = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != last){
                arr[k++] = arr[i];
            }
            last = arr[i];
        }

        return k;
    }
    public static void main(String[] args) {
        int []arr = {0, 0, 1, 1, 1, 2, 3, 3, 4, 4};
        System.out.println(removeDuplicates(arr));
    }
}
