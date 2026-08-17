public class Main {
    public static void getSubarrays(int[] arr){
        int n = arr.length;
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                for(int i = start; i <= end; i++){
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        getSubarrays(arr);
    }
}
