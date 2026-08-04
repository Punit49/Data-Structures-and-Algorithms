
import java.util.Scanner;


public class Main {

    public static int getHCF(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 && b == 0) return -1;
        if(a == 0) return b;
        if(b == 0) return a;

        int min = Math.min(a, b);

        for(int i = min; i >= 1; i--){
            if(a % i == 0 && b % i == 0) return i;
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getHCF(a, b));
    }
}
