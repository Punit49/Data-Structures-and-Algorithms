import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int randomNum  = (int)(Math.random() * 100) + 1;
        int userNum = 0;
        int attempts = 5;

        while(randomNum != userNum && attempts >= 1){
            userNum = sc.nextInt();
            if(userNum > randomNum){
                System.out.println("High");
            } else {
                System.out.println("Low");
            }
            attempts--;
        }

        if(attempts == 0){
            System.out.println("Better Luck Next TIme " + randomNum +" was the number");
        } else {
            System.out.println("Congrats " + randomNum +" was the number");
        }
    }
}
