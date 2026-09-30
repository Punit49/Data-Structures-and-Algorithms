import java.util.HashMap;

public class BetterHashMap {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int majorityElement = nums[0];

        for(int n: nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for(Integer key : freq.keySet()){
            if(freq.get(key) > nums.length / 2){
                majorityElement = key;
                break;
            }
        }
        
        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}

// TC - O(n)
// SC - O(n)
// LC - 169. Majority Element - https://leetcode.com/problems/majority-element/description/