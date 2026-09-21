class Solution {
    public static boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        long product = 1;

        while(product <= n){
            product *= 2;
            if(product == n) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 64;
        System.out.println(isPowerOfTwo(n));
    }
}