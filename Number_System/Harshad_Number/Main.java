import java.util.Scanner;

public class Main {
    public static int getDigitsSum(int n){
        int sum = 0;
        
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if(n == 0){
            System.out.println("No");
            return;
        }

        int digitSum = getDigitsSum(n);

        System.out.println(n % digitSum == 0 ? "Yes" : "No");
    }
}
