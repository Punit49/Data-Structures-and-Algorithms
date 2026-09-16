public class Solution {
    public static int reverseDigits(int n, int rev){
        if(n == 0) return rev;
        int digit = n % 10;
        rev = rev * 10 + digit;
        return reverseDigits(n / 10, rev);
    }
    public static void main(String[] args) {
        int n = -456;
        System.out.println(reverseDigits(n, 0));
    }
}
