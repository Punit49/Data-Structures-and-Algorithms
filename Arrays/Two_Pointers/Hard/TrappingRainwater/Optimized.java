public class Optimized {
    public static int maxWater(int [] height){
        int n = height.length;
        int l = 0, r = n - 1;
        int maxWater = 0;
        int leftMax = 0;
        int rightMax = 0;

        while(l < r){
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            if(leftMax < rightMax){
                maxWater += leftMax - height[l];
                l++;
            } else {
                maxWater += rightMax - height[r];
                r--;
            }
        }

        return maxWater;

    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(maxWater(height));
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - 42.https://leetcode.com/problems/trapping-rain-water/description/