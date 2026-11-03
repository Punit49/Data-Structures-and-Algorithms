public class Solution{
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(target > arr[mid]){
                end = mid - 1;
            } else start = mid + 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {45, 89, 42, 39, 23, 21, 19, 10};
        System.out.println(binarySearch(arr, 89));
    }
}