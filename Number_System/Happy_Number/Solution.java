import java.util.ArrayList;
class Solution {
    public static int getDigitSqSum(int  n){
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        ArrayList<Integer> seen = new ArrayList<>();

        while(n != 1){
            if(seen.contains(n)) return false;
            seen.add(n);
            n = getDigitSqSum(n);
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
