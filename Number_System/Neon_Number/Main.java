import java.util.Scanner;

public class Main {
     public static boolean isNeon(int n){
        if(n < 0) return false;
        long sum = 0L;
        long squared = n * n;

        while(squared > 0){
            sum += squared % 10;
            squared /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isNeon(n));
    }
}
