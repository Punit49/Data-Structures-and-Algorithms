public class UsingRunningVariable{
    public static int peakIndexInMountainArray(int[] arr) {
        int peakIndex = 0;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid + 1] > arr[mid]){
                peakIndex = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return peakIndex;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 10, 12, 14, 9, 3, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}