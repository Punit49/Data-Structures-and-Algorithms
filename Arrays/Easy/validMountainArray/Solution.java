public class Solution{
    public static boolean isMountainArray(int[] arr){
        if(arr.length < 3) return false;
        int n = arr.length;
        int i = 0;
        while(i < n - 1 && arr[i] < arr[i + 1]) i++;
        if(i == n - 1) return false;

        int j = n - 1;
        while(j > 0 && arr[j] < arr[j - 1]) j--;
        if(j == 0) return false;
        return i == j;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2, 1, 0};
        System.out.println(isMountainArray(arr));
    }
}

// Time - O(n) 
// Space - O(1) 
// Leetcode - 941. Valid Mountain Array - https://leetcode.com/problems/valid-mountain-array/description/