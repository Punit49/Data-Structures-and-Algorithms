
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double discount = 0;

        if(amount > 0 && amount <= 5000){
            discount = 0;
        } else if(amount > 5000 && amount <= 7000){
            discount = 5;
        } else if(amount > 7000 && amount <= 9000){
            discount = 10;
        } else if(amount > 9000){
            discount = 20;
        }

        double disAmt = (amount * discount) / 100;
        System.out.println(amount - disAmt);
    }
}
