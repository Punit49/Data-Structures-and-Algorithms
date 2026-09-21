class Solution {
    public static boolean isPerfectSquare(int num) {
        for(long i = 1; i * i <= num; i++){
            if(i * i == num) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 36;
        System.out.println(isPerfectSquare(n));
    }
}