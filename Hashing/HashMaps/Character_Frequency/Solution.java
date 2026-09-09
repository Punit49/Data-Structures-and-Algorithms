package Hashing.HashMaps.Character_Frequency;
import java.util.*;

class Solution {
    public static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int element: arr){
            int val = frequency.getOrDefault(element, 0);
            frequency.put(element, val + 1);
        }

        for(Integer key: frequency.keySet()){
            System.out.println(key + " " + frequency.get(key));
        }
    }
    public static void main(String[] args) {
        int[] elements = {10, 1, 1, 2, 3, 4, 10, 5, 4};
        countFrequency(elements);
    }
}

