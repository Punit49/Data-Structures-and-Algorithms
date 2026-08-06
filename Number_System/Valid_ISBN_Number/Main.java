
import java.util.Scanner;

public class Main {
    public static boolean isValidISBNNumber(long n){
        if(!(n >= 1000000000L && n <= 9999999999L)) return false;
        int position = 10;
        long sum = 0L;

        while(n > 0){
            long digit = n % 10;
            sum += (digit * position);
            position--;
            n /= 10;
        }

        return sum % 11 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(isValidISBNNumber(n));
    }
}
