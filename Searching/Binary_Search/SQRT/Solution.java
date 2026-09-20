class Solution {
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int sqrt = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if((long)mid * mid <= x){
                sqrt = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return sqrt;
    }
    public static void main(String[] args) {
        int n = 40;
        System.out.println(mySqrt(n));
    }
}  