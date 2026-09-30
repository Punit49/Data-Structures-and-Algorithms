class Bruteforce {
    public static int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]) count++;
            }
            if(count > nums.length / 2) return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}  

// TC - O(n^2)
// SC - O(1)
// LC - 169. Majority Element - https://leetcode.com/problems/majority-element/description/