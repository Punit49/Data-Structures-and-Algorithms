public class Euclidean_Modulo {
    public static int gcd(int a, int b){
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        while(y != 0){
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return x;
    }
    public static void main(String[] args) {
        int a = 96, b = 144; 
        System.out.println(gcd(a, b));
    }
}
