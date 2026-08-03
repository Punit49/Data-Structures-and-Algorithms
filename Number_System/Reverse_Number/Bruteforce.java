import java.util.Scanner;

public class Bruteforce {
    public static int reverseInteger(int n){
        if(n <= 0) return 0;

        String reversed = "";

        while(n > 0){
            int digit = n % 10;
            reversed = reversed + digit;
            n /= 10;
        }
        
        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseInteger(n));
    }
}
