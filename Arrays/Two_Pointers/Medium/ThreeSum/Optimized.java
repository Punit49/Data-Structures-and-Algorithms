import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimized {
    public static List<List<Integer>> threeSum (int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    ans.add(triplet);
                    j++; 
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

        return ans;
    } 
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

// Time Complexity - 
    // Sorting - O(n log n) 
    // i * j loop - O(n^2) 
    // Overall - O(n^2)
// Space Complexity - O(m) where m is number of unique triplets - O(n^2)

// Leetcode - 15 - https://leetcode.com/problems/3sum/description/
