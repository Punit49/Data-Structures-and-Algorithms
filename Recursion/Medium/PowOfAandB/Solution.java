class Solution {
    public static double pow(double a, int b){
        if(b == 0) return 1;
        double sol = pow(a, b / 2);
        if(b % 2 == 0) return sol * sol;
        return sol * sol * a;
    }
    public static double myPow(double x, int n) {
        double res = pow(x, n);
        if(n < 0) return 1.0/res;
        return res;
    }   
    public static void main(String[] args) {
        int a = 2, b = 12;
        System.out.println(myPow(a, 0));
    }
}