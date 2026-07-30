package loops.Q21_Print_N_Natural_Nums;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 1){
            for(int i = 1; i <= n; i++){
                System.out.println(i);
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}