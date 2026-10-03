import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bruteforce {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[k] + nums[j] == 0){
                        List<Integer> triplet = new ArrayList<>(); // O(1)
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet); // O(1)
                        if(!result.contains(triplet)){
                            result.add(triplet);
                        }
                    }
                }
            }
        }

        return result;
    }  
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

// Time Complexity- O(n³ × k) worst case due to result.contains()
// Space Complexity - O(1) Auxillary, if considering output then O(k) where k is number of unique triplets
    // O(k)   → precise output-space complexity
    // O(n³)  → worst-case bound when expressed only in terms of n
// Leetcode - 15 - https://leetcode.com/problems/3sum/description/