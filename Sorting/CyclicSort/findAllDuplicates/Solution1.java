
import java.util.*;

class Solution1 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        int i = 0;

        while(i < nums.length){
            int correctIdx = nums[i] - 1;
            if(nums[i] != nums[correctIdx]){
                swap(nums, i, correctIdx);
            } else i++;
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1) duplicates.add(nums[j]);
        }

        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(arr));
    }
}

// Complexity:
// Time: O(n)
// Space: O(1), excluding the output list
// LC - 442 - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
