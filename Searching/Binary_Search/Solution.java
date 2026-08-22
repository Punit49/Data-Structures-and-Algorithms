public class Solution{
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;
            else if(target > arr[mid]){
                start = mid + 1;    
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-10, -1, 0, 10, 12, 21, 90};
        int target = 11;
        System.out.println(binarySearch(arr, target));
    }
}