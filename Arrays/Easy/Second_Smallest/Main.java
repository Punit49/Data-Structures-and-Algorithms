public class Main {
    public static int secondSmallest(int[] arr){
        int smallest = Math.min(arr[0], arr[1]);
        int secondSmall = Math.max(arr[0], arr[1]);

        for(int i = 2; i < arr.length; i++){
            if(arr[i] < smallest){
                secondSmall = smallest;
                smallest = arr[i];
            } else if(arr[i] < secondSmall && arr[i] > smallest){
                secondSmall = arr[i];
            }
        }

        return secondSmall;
    }
    public static void main(String[] args){
        int[] arr = {9, 1, 9, 2, 9, 9};
        System.out.println(secondSmallest(arr)); 
    }
}
