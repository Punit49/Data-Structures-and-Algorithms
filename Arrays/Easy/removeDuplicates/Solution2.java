public class Solution2 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while(i < nums.length - 1){
            if(nums[i] != nums[i + 1]){
                nums[j++] = nums[i+1];
            }
            i++;
        }
        return j;
    }
    public static void main(String[] args) {
        int []arr = {0, 0, 1, 1, 1, 2, 3, 3, 4, 4};
        System.out.println(removeDuplicates(arr));
    }
}