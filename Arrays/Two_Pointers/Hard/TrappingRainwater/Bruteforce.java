public class Bruteforce {
    public static int maxWater(int [] height){
        int waterCount = 0;

        for(int i = 0; i < height.length; i++){
            int leftMax = height[i];
            int rightMax = height[i];
            for(int j = i - 1; j >= 0; j--) leftMax = Math.max(leftMax, height[j]);
            for(int k = i + 1; k < height.length; k++) rightMax = Math.max(rightMax, height[k]);
            waterCount += Math.min(leftMax, rightMax) - height[i];
        }
        return waterCount;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(maxWater(height));
    }
}


// Time Complexity - O(n^2)
// Space Complexity - O(1)
// Leetcode - 42.https://leetcode.com/problems/trapping-rain-water/description/