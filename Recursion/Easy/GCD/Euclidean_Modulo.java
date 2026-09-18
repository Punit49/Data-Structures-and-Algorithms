public class Euclidean_Modulo {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int a = 6, b = 40; 
        System.out.println(gcd(Math.max(a, b), Math.min(a, b)));
    }
}
