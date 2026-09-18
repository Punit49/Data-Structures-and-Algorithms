public class Euclidean_Subtraction{
    static int gcd(int a, int b){
        if(b == 0) return a;
        if(a == 0) return b;
        if(a == b) return a;
        if(a > b) a -= b;
        else b -= a;
        return gcd(a, b);
    } 
    public static void main(String[] args) {
        int a = 12, b = 0; 
        System.out.println(gcd(a, b));
    }
}

// TC - O(max(a, b))
// SC - O(max(a, b)) / k number of recursive calls