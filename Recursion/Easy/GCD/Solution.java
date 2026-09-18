public class Solution{
    static int gcd(int a, int b, int min){
        if(min == 1) return 1;
        if(a % min == 0 && b % min == 0) return min;
        return gcd(a, b, min - 1);
    }
    // 2
    // static int gcd(int a, int b, int n) {
    //     if (a % n == 0 && b % n == 0) return n;
    //     return gcd(a, b, n - 1);
    // }
    public static void main(String[] args) {
        int a = 60;
        int b = 18;
        System.out.println(gcd(a, b, Math.min(a, b)));
    }
}

// TC - O(min(a, b));
// SC - O(min(a, b));
