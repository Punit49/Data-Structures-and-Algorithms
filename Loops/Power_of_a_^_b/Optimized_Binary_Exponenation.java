
import java.util.Scanner;

public class Optimized_Binary_Exponenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long exp = b;
        b = Math.abs(b);

        double ans = 1;

        while(b > 0){
            if(b % 2 != 0){
                b -= 1;
                ans *= a;
            } else {
                a *= a;
                b /= 2;
            }
        }

        if(exp < 0){
            ans = 1.0 / ans;
        }
        
        System.out.println(ans);
    }
}
