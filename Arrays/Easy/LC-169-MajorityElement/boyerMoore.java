class boyerMoore {
    public static int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;

        for(int n : nums){
            if(count == 0) element = n;
            if(n == element) count++;
            else count--;
        }

        return element;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}  

// TC - O(n)
// SC - O(1)
// LC - 169. Majority Element - https://leetcode.com/problems/majority-element/description/