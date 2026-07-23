import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name - ");
        String name = sc.nextLine();
        System.out.println("Enter your age - ");
        int age = sc.nextInt();

        if(age >= 18) System.out.println("Hello " + name + " You are eligible to vote!");
        else System.out.println("Hello " + name + " You will be eligible to vote in " + (18 - age) + " years");
    }
}
