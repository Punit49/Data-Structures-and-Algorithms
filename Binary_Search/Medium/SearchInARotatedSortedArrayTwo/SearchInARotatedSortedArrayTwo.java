public class SearchInARotatedSortedArrayTwo{
    public static boolean searchRotated(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return true;
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
                continue;
            }
            if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target <= arr[end]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target >= arr[mid] && target <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
    public static void main(String[] args){
        int[] arr = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(searchRotated(arr, target));
    }
}

// Time - O(log n), space - O(1)
// Leetcode 81 - https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

