import java.util.*;

class Solution3 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int num : set1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }
        for(int num : set2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 5};
        System.out.println(findDifference(nums1, nums2));
    }
}

// Time Complexity:
// - O(n) – Creating the first HashSet.
// - O(m) – Creating the second HashSet.
// - O(n + m) – Checking elements in both sets.
// Overall: O(n + m) average time.

// Space Complexity:

// - O(n + m) – Storing unique elements in both HashSets and the resulting lists.

// Where n and m are the lengths of nums1 and nums2.

// Leetcode - 2215. Find the Difference of Two Arrays - https://leetcode.com/problems/find-the-difference-of-two-arrays/description/