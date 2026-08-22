public class LinearSearch{
    static int searchLinear(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 90};
        int target = 40;
        System.out.println(searchLinear(arr, target));
    }
}