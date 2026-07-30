import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;

        if(a == 0 && b == 0){
            System.out.println("Undefined");
            return;
        }

        for(int i = 1; i <= b; i++){
            result *= a;
        }   

        System.out.println(result);
    }
}
