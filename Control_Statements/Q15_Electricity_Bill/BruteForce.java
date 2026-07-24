
import java.util.Scanner;

public class BruteForce{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double amt = 0;

        if(units > 0 && units <= 100){
            amt = units * 4.2;
        } else if(units > 100 && units <= 200){
            amt = (100 * 4.2) + (units - 100) * 6;
        } else if(units > 200 && units <= 400){
            amt = (100 * 4.2) + (100 * 6) + (units - 200) * 8;
        } else if(units > 400){
            amt = (100 * 4.2) + (100 * 6) + (200 * 8) + (units - 400) * 13;
        }
        
        System.out.println(amt);
    }
}
