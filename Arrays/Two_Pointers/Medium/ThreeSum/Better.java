import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Better {
    public static List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int offset = -(nums[i] + nums[j]);
                if(set.contains(offset)){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(offset);
                    Collections.sort(list);
                    result.add(list);
                }
                set.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }  
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

// Time Complexity- O(n^2)
// Space Complexity - O(n^2) / O(m) where m = number of unique triplets and O(1) without output consideration 
// Leetcode - 15 - https://leetcode.com/problems/3sum/description/
