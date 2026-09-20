public  class Solution {
    static int getSqrt(int n){
        int start = 1;
        int end = n;
        int sqrt = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if((long) mid * mid <= n){
                sqrt = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return sqrt;
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(getSqrt(n));
    }
}