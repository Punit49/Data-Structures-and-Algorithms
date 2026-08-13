public class Main {
    public static int secondLargest(int[] arr){
        int max = Math.max(arr[0], arr[1]);
        int secondMax = Math.min(arr[0], arr[1]);

        for(int i = 2; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
    public static void main(String[] args){
        int[] arr = {9, 8, 9, 1, 12, 19};
        System.out.println(secondLargest(arr)); 
    }
}
