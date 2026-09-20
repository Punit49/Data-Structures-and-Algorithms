public class Solution {
    public static int getSqrt(int n){
        int sqrt = 0;
        for(int i = 1; i <= n / i; i++){
            if(i * i == n) return i;
            sqrt = i;
        }
        return sqrt;
    }
    public static void main(String[] args) {
        int n = 40;
        System.out.println(getSqrt(n));
    }
}

// TC - O(square root of n)
// SC = O(1)

// LC - https://leetcode.com/problems/sqrtx/