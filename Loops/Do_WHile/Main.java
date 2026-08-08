import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{ 
            System.out.println("Enter Your Choice.");
            System.out.println("Press 1 for addition.");
            System.out.println("Press 2 for subtarction.");
            System.out.println("Press 3 for multiplication.");
            System.out.println("Press 4 for divide - ");
            System.out.println("Press 5 for Exit.");
            n = sc.nextInt();
            if(n == 5) System.exit(0);

            System.out.println("Enter A - ");
            int a = sc.nextInt();
            System.out.println("Enter B - ");
            int b = sc.nextInt();

            if(n == 1) System.out.println("Sum is - " + (a + b));
            else if(n == 2) System.out.println("Sub is - " + (a - b));
            else if(n == 3) System.out.println("Mul is - " + (a * b));
            else if(n == 4) System.out.println("Div is - " + (a / b));
            else System.out.println("Invalid Input");

        } while(n != 5);
    }
}