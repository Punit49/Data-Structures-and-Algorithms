import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte month = sc.nextByte();

        if(month == 2){
            System.out.println("28 Days");
        } else if (month == 4 || month == 6 || month == 9 ||  month == 11) {
            System.out.println("30 Days");
        } else if(month >= 1 && month <= 12){
            System.out.println("31 Days");
        } else {
            System.out.println("Invalid Month");
        }
    }
}
