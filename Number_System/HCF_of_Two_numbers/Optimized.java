public class Optimized {
    static int gcd(int max, int min){
        int gcd = 1;
        for(int i = 1; i * i <= min; i++){
            if(min % i == 0){
                if(max % i == 0){
                    gcd = Math.max(gcd, i);
                }
                int pair = min / i;

                if(max % pair == 0){
                    gcd = Math.max(gcd, pair);
                }
            }
        }
        return gcd; 
    }
    public static void main(String[] args) {
        int a = 48;
        int b = 12;
        System.out.println(gcd(Math.max(a, b), Math.min(a, b)));
    }
}
