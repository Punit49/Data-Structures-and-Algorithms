import java.util.Arrays;

class Solution {
    public static int countPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        int count = 0;

        for(int i = 2; i * i <= n; i++){
            if(primes[i]){
                for(int j = i * i; j <= n; j += i){
                    if(primes[j]) primes[j] = false;
                }
            }
        }

        for(int i = 2; i < n; i++){
            if(primes[i]) count++;
        }

        return count;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
}