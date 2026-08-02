import java.util.Scanner;

public class Bruteforce {
    public static boolean isPrime(int n){
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
        if(n <= 1) return;
        boolean isSoloPrime = true;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                isSoloPrime = false;
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
                if(n / i != i){
                    if(isPrime(n / i)) System.out.print(n / i + " ");
                }
            }
        }

        if(isSoloPrime) System.out.println(n);
    }
}
