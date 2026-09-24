import java.util.Arrays;

public class Bruteforce {
    public static int[] duplicateZeroes(int[] arr){
        int k = 0;
        int i = 0;
        int[] temp = new int [arr.length];
        while(k < temp.length){
            temp[k++] = arr[i];
            if(arr[i] == 0 && k < temp.length){
                temp[k++] = arr[i];
            }
            i++;
        }
        for(int j = 0; j < temp.length; j++){
            arr[j] = temp[j];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 0, 4, 8};
        System.out.println(Arrays.toString(duplicateZeroes(arr)));
    }
}

// Time - O(n)
// Space - O(n)
// Leetcode - 1089 Duplicate Zeros - https://leetcode.com/problems/duplicate-zeros/description/