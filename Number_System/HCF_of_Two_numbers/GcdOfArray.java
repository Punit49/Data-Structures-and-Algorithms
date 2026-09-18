public class GcdOfArray {
    static int arrayGcd(int[] arr){
        int gcdNum = arr[0];
        for(int num: arr){
            gcdNum = gcd(gcdNum, num);
        }
        return gcdNum;
    }
    static int gcd(int a, int b){
        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {36, 34, 28, 76, 88};
        System.out.println(arrayGcd(arr));
    }
}
