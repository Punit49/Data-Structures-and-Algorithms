public class Optimized{
    public static boolean isMountainArray(int[] arr){
        if(arr.length < 3) return false;
        int n = arr.length;
        boolean up = false;
        boolean down = false;
        
        for(int i = 1; i < n; i++){
            if(arr[i - 1] == arr[i]) return false;

            if(!down){
                if(arr[i] > arr[i - 1]) up = true;
                else {
                    if(!up) return false;
                    down = true;
                }
            } else {
                if(arr[i] > arr[i - 1]) return false;
            }
        }

        return up && down;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2, 1, 0};
        System.out.println(isMountainArray(arr));
    }
}

// Time - O(n) 
// Space - O(1) 
// Leetcode - 941. Valid Mountain Array - https://leetcode.com/problems/valid-mountain-array/description/