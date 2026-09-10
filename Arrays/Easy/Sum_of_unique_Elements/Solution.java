class Solution {
    public static int sumOfUnique(int[] nums) {
        int sum=0;
        int[] frequency = new int[101];

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            frequency[val]++;
        }

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(frequency[val] == 1) sum += val;
        }    

        return sum;
    }
    public static void main(String[] args) {
        int[]arr = {1, 1, 4, 5, 9, 10, 2, 4, 5, 3};
        System.out.println(sumOfUnique(arr));
    }
}