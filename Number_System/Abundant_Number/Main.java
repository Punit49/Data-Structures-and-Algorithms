import java.util.Scanner;

public class Main {
    static boolean isAbundant(int n){
        if(n < 12) return false;
        int sum = 1;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) {
                sum += i;
                
                if(n / i != i){
                    sum += n/i;
                }
            }
        }

        return sum > n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isAbundant(n));
    }
}

