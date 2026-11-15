class Solution {
    public static int findCeil(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ceil = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= x){
                ceil = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return ceil;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 4;
        System.out.println(findCeil(arr, x));
    }
}
