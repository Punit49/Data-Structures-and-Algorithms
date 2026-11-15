class Solution {
    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while(start <= end){
            int mid = start + (end - start) / 2;
            long product = (long) mid * mid;
            if(product == num) return true;
            else if(product > num) end = mid - 1;
            else start = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
}