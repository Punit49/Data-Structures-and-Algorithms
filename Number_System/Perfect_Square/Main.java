import java.util.Scanner;

public class Main {
    public static boolean isPerfect(int n){
        if(n < 0) return false;
        int sqrt = (int)Math.sqrt(n);
        return (long) sqrt * sqrt == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n));
    }
}
