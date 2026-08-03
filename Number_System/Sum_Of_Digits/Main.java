
import java.util.Scanner;

public class Main {
    public static int getDigitSum(int n){
        if(n < 1) return 0;
        int digitSum = 0;
    
        while(n > 0){
            digitSum += n % 10;
            n /= 10;
        }

        return digitSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getDigitSum(n));
    }
}
