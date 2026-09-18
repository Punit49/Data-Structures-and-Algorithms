class Formula {
    static int gcd(int a, int b){
        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static int findLcm(int a, int b) {
        return (a * b) / gcd(Math.max(a, b), Math.min(a, b));
    }
    public static void main(String[] args) {
        int a = 14, b = 21;
        System.out.println(findLcm(a, b));
    }
}