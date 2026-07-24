
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double amt = 0;

        if(units > 400){
            int n = units - 400;
            amt += n * 13;
            units -= n;
        }
        if(units > 200){
            int n = units - 200;
            amt += n * 8;
            units -= n;
        }
        if(units > 100){
            int n = units - 100;
            amt += n * 6;
            units -= n;
        }
        if(units > 0){
            amt += units * 4.2;
        }

        System.out.println(amt);
    }
}
