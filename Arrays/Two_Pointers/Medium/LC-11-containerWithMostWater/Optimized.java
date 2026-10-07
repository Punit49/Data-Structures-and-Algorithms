class Optimized {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int i = 0, j = height.length - 1;

        while(i < j){
            int area = Math.min(height[i], height[j]) * (j - i);
            maxWater = Math.max(maxWater, area);
            if(height[j] > height[i]) i++;
            else j--;
        }

        return maxWater;
    }
    
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}   