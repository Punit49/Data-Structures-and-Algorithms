public class MaxConsecutiveOnes{
    static int maxConsecutiveOne(int [] nums){
        if(nums.length == 0) return 0;
        int maxCount = 0;
        int curCount = 0;

        for(int n: nums){
            if(n == 1){
                curCount++;
                if(curCount > maxCount) maxCount = curCount;
            } else curCount = 0;
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveOne(arr));
    }
}