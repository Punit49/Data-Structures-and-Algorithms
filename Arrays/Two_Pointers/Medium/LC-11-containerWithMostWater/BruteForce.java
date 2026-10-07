class BruteForce {
    public static int maxArea(int[] height) {
        int maxWater = 0;

        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){
                int w = j - i;
                int h = Math.min(height[i], height[j]);
                maxWater = Math.max(maxWater, w * h);
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        int[] height = {2, 5, 3, 4, 6};
        System.out.println(maxArea(height));
    }
}   