import java.util.*;

class Optimized {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            int offset = target - value;
            if(map.containsKey(offset)){
                return new int[]{i, map.get(offset)};
            } else {
                map.put(value, i);
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 2, 3, 7};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
     }
}


// TC - O(n)
// SC - O(n)