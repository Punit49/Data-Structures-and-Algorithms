class Solution {
    public static boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int start = 1; 
        int end = num;

        while(start <= end){
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if(square == num) return true;
            else if(square > num){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 49;
        System.out.println(isPerfectSquare(n));
    }
}