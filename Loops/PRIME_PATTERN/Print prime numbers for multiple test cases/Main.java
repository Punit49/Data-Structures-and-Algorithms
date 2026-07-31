import java.util.Scanner;

public class Main {

    static boolean isPrime(int n){
        if(n == 2) return true;
        if(n <= 1 || n % 2 == 0) return false;
        
        int sqrt = (int)Math.sqrt(n);
        for(int i = 3; i <= sqrt; i += 2){
            if(n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            if(isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
