
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0) return;

        int prev = 0;
        int cur = 1;

        System.out.print(prev + " ");
        
        for(int i = 1; i <= (n - 1); i++){
            System.out.print(cur + " ");
            int sum = prev + cur;
            prev = cur;
            cur = sum;
        }
    }
}
