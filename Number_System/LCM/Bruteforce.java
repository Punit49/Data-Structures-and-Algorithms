class Bruteforce {
    public static int findLcm(int a, int b) {
        if(a == 0 || b == 0) return 0;
        int lcm = Math.max(a, b);
        int max = Math.max(a, b);

        while(true){
            if(lcm % a == 0 && lcm % b == 0) break;
            lcm += max;
        }

        return lcm;
    }
    public static void main(String[] args) {
        int a = 14, b = 21;
        System.out.println(findLcm(a, b));
    }
}

// TC: O(min(a,b)) — We start from the larger number and keep adding it; in the worst case, we may need about min(a,b) jumps to reach the LCM.
// SC: O(1)