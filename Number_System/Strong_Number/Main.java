import java.util.Scanner;

public class Main {
    public static boolean isStrong(int n){
        if(n <= 0) return false;
        int original = n;
        int factorialSum = 0;

        while(n > 0){
            int digit = n % 10;
            int factorial = 1;

            for(int i = 1; i <= digit; i++){
                factorial *= i;
            } 
            n /= 10;
            factorialSum += factorial;
        }

        return original == factorialSum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isStrong(n));
    }
}
