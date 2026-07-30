
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        if(start > end){
            int temp = start;
            start = end;
            end = temp;
        }

        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
