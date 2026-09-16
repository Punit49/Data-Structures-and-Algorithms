public class Solution{
    static int sumOfDigits (int n){
        if(n == 0) return n;
        int digit = n % 10;
        return digit + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        int n = 456;
        System.out.println(sumOfDigits(n));
    }
}