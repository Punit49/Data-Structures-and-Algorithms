public class Solution{
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = (arr[start] < arr[end]);

        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target) return mid;

            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                } else end = mid - 1;
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {45, 89, 42, 39, 23, 21, 19, 10};
        int[] arr2 = {-10, 0, 13, 29, 32, 44, 59, 61, 92};
        System.out.println(binarySearch(arr, 89));
        System.out.println(binarySearch(arr2, 61));
    }
}