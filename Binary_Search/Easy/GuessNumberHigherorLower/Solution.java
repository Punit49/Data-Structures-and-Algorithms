public class Solution {
    static int pick = 6;

    public static int guess(int num) {
        if (num > pick) return -1;
        else if (num < pick) return 1;
        else return 0;
    }

    public static int guessNumber(int n) {
        int start = 0;
        int end = n;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int response = guess(mid);
            if(response == 0) return mid;
            else if(response == -1) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }
}
