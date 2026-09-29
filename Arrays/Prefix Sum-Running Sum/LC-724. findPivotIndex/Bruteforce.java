class Bruteforce {
    public static int pivot(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int leftSum = 0;
            int rightSum = 0;
            int j = i - 1;
            int k = i + 1;

            while(j >= 0){
                leftSum += arr[j];
                j--;
            }
            while(k < n){
                rightSum += arr[k];
                k++;
            }
            if(leftSum == rightSum) return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivot(arr));
    }
}

// TC - O(n^2)
// SC - O(1)
// Leetcode - P.724 - https://leetcode.com/problems/find-pivot-index/description/