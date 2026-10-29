import java.util.HashMap;

public class Better {
    public static int longestSubarray(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k){
                maxLength = Math.max(maxLength, i + 1);
            }
            int remaining = sum - k;
            if(map.containsKey(remaining)){
                maxLength = Math.max(maxLength, i - map.get(remaining));
            }
            // for positives only - 
            // map.put(sum, i);

            // for positives and negatives both - 
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}

// Time complexity: O(n), where n is the length of the input array. Each element is processed once, and HashMap operations are O(1) on average.
// Space complexity: O(n) in the worst case, since in the worst case up to n distinct prefix sums can be stored in the map.
// GFG - https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1