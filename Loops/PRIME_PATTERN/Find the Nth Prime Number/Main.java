import java.util.Scanner;

public class Main {
    static boolean isPrime(int n){
        if(n == 2) return true;
        if(n <= 1 || n % 2 == 0) return false;
        
        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 2; count < n; i++){
            if(isPrime(i)) {
                count++;
                if(count == n) {
                    System.out.println(i);
                }
            }
        }
    }
}
