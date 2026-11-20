public class FindMinimuminRotatedSortedArray{
    public static int findMin(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[start] <= arr[mid]){
                ans = Math.min(ans, arr[start]);
                start = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                end = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }
}

// Time - O(log n), Space - O(1)
// Leetcode 153 -> https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/