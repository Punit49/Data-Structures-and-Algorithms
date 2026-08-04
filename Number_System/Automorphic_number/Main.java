
import java.util.Scanner;


public class Main {

    public static boolean isAutomorphic(int n){
        long squared = 1L * n * n;

        while(n > 0){
            int nDigit = n % 10;
            long squaredDigit = squared % 10;

            if(nDigit != squaredDigit) return false;
            n /= 10;
            squared /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isAutomorphic(n));
    }
}
