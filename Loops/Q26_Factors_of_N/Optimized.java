import java.util.Scanner;

public class Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sqrt = Math.sqrt(n);
        
        for(int i = 1; i <= sqrt; i++){
            if(n % i == 0){
                System.out.print(i + " ");

                if((n / i) != i){
                    System.out.print(n / i + " ");
                }
            }
        }
    }
}
