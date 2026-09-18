public class Euclidean_Subtraction{
    // substraction method
    static int gcd(int a, int b){
        while(a != b){
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    } 
    public static void main(String[] args) {
        int a = 96, b = 144; 
        System.out.println(gcd(a, b));
    }
}

// TC - O(max(a, b)) 
// SC - O(1)