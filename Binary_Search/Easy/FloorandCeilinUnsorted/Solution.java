class Solution {
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = Integer.MAX_VALUE;
        for(int n: arr){
            if(n > floor && n <= x) floor = n;
            if(n < ceil && n >= x) ceil = n;
        }
        return new int[]{floor, ceil == Integer.MAX_VALUE ? -1 : ceil};
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;
        int[] result = getFloorAndCeil(x, arr);
        System.out.println(result[0] + " " + result[1]);
    }
} 