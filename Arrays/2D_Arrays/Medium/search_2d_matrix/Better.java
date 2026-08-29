public class Better {
    public static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return true;
            else if(target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }

        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            if(target >= matrix[i][0] && target <= matrix[i][n - 1]){
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {18, 25, 28, 30, 35},
            {38, 41, 45, 47, 50}
        };

        int target = 45;
        System.out.println(searchMatrix(matrix, target));
    }
}

// TC - O(m + log(n))
// sc- O(1)