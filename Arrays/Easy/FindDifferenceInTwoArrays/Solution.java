import java.util.*;

class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getList(nums1, nums2), getList(nums2, nums1));
    }
    private static List<Integer> getList(int[] nums1, int[] nums2){
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int n: nums2) s2.add(n);
        for(int n: nums1){
            if(!s2.contains(n)){
                s1.add(n);
            }
        }
        return new ArrayList<>(s1);
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 5};
        System.out.println(findDifference(nums1, nums2));
    }
}

// Time - O(n)
// Space - O(n)
// Leetcode - 2215. Find the Difference of Two Arrays - https://leetcode.com/problems/find-the-difference-of-two-arrays/description/