class Solution {
    public static int pivot(int arr[]) {
        int leftSum = 0;
        int rightSum = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            rightSum += arr[i];
        }

        for(int i = 0; i < n; i++){
            if(leftSum == rightSum - leftSum - arr[i]) return i;
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivot(arr));
    }
}

// TC - O(n)
// SC - O(1)
// Leetcode - P.724 - https://leetcode.com/problems/find-pivot-index/description/