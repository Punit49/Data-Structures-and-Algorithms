class Solution {
    public static int searchInfiniteArray(int[] arr, int target) {
        if(arr.length == 0) return -1;
        int start = 0;
        int endingIndex = 1;

        while(endingIndex < arr.length && arr[endingIndex] < target){
            start = endingIndex;
            endingIndex *= 2;
        }

        endingIndex = Math.min(endingIndex, arr.length - 1);

        while(start <= endingIndex){
            int mid = start + (endingIndex - start) / 2;

            if(arr[mid] == target) return mid;
            else if(target > arr[mid]){
                start = mid + 1;
            } else {
                endingIndex = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        System.out.println(searchInfiniteArray(arr, target));
    }
}  