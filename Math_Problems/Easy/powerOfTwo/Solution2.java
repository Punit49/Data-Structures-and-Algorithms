public class Solution2 {
    public static boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n % 2 == 1 || n <= 0) return false;

        while(n != 1){
            if(n % 2 == 1) return false;
            n /= 2;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 64;
        System.out.println(isPowerOfTwo(n));
    }
}
