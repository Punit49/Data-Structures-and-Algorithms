class Better {
    public static int trap(int[] height) {
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];    
        maxLeft[0] = height[0];
        maxRight[n - 1] = height[n - 1];
        int maxWater = 0;

        for(int i = 1; i < n; i++){
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        for(int i = n - 2; i >= 0; i--){
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        for(int i = 0; i < n; i++){
            maxWater += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return maxWater;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
    }
} 
// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - 42.https://leetcode.com/problems/trapping-rain-water/description/