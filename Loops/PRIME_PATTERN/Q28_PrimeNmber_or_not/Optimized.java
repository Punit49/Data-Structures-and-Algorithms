package Loops.PRIME_PATTERN.Q28_PrimeNmber_or_not;
import java.util.Scanner;

public class Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 2){
            System.out.println("Prime");
            return;
        } else if(n <= 1 || n % 2 == 0){
            System.out.println("Not Prime");
            return;
        } else {
            int sqrt = (int)Math.sqrt(n);
            for(int i = 3; i <= sqrt; i = i + 2){
                if(n % i == 0){
                    System.out.println("Not Prime");
                    return;
                }
            }
        }

        System.out.println("Prime");
    }
}
