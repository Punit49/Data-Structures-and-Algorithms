public class Solution{
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(end < arr.length && arr[end] < target){
            start = end;
            end *= 2;
        }

        end = Math.min(end, arr.length - 1);

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(target > arr[mid]){
                start = mid + 1;
            } else end = mid - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 29, 31, 33, 39, 45, 89};
        System.out.println(binarySearch(arr, 89));
    }
}