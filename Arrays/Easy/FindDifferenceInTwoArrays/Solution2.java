import java.util.*;

class Solution2 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]) set.add(nums1[i]);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums1.length; j++){
                if(nums2[i] == nums1[j]) set.add(nums2[i]);
            }
        }

        for(int n: nums1){
            if(!set.contains(n) && !n1.contains(n)) n1.add(n);
        }
        for(int n: nums2){
            if(!set.contains(n) && !n2.contains(n)) n2.add(n);
        }
        
        ans.add(n1);
        ans.add(n2);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 5};
        System.out.println(findDifference(nums1, nums2));
    }
}

// Time Complexity:
// - O(n + m) – Inserting elements into both HashSets.
// - O(n + m) – Checking elements in both sets.
// - Overall: O(n + m) average time.
// Space Complexity:

// - O(n + m) – For storing elements in both HashSets and the two result lists.

// Where n and m are the lengths of nums1 and nums2.

// Leetcode - 2215. Find the Difference of Two Arrays - https://leetcode.com/problems/find-the-difference-of-two-arrays/description/