public class Main {
    public static boolean isIncreasing(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] > arr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {10, 12, 5, 14, 900, 920};
        System.out.println(isIncreasing(arr));
    }
}
