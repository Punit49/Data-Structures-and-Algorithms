import java.util.HashMap;

class Best {
    public static int subarraySum(int[] nums, int k) {
        if(nums.length < 1) return 0;
        int subarrayCount = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int remove = sum - k;
            subarrayCount += map.getOrDefault(remove, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return subarrayCount;
    }

    public static void main(String[] args){
        int[] arr = {3, -3, 1, 1, 1};
        int k = 3;
        System.out.println(subarraySum(arr, k));
    }
}


// Time - O(n)
// Space - O(n)
// LC - 560. Subarray Sum Equals K -> https://leetcode.com/problems/subarray-sum-equals-k/description/