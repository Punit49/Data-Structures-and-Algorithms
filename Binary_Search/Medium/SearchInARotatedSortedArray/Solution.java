class Solution {
    public static int searchRotated(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = (right + left) / 2;
            if(nums[mid] == target) return mid;

            if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(target > nums[mid] && target <= nums[right]){
                    left  = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {5, 6, 1, 2, 3, 4};
        int target = 3;
        System.out.println(searchRotated(arr, target));
    }
}

// Complexity
// - Time: O(log n) — eliminate half the search space in each iteration.
// - Space: O(1) — use only a few variables.

// Leetcode - 33 -> https://leetcode.com/problems/search-in-rotated-sorted-array/description/ 