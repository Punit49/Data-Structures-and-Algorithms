public class Solution{
    public static int minOfABC(int[] A, char[] B){
        if(A.length < 3){
            int min = Integer.MAX_VALUE;
            for(int num: A){
                min = Math.min(min, num);
            }
            return min;
        }

        int sumOfAB = 0;
        int sumOfC = 0;

        for(int i = 0; i < A.length; i++){
            if(B[i] == 'c'){
                sumOfC += A[i];
            } else{
                sumOfAB += A[i];
            }
        }

        return Math.min(sumOfAB, sumOfC);
    }
    public static void main(String[] args) {
        int[] A = {3, 6, 4, 5, 6, 20}; 
        char[] B = {'a', 'c', 'b', 'b', 'a', 'c'};

        System.out.println(minOfABC(A, B));
    }
}