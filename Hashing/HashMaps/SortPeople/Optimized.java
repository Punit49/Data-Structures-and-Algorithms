import java.util.*;
class Optimized {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        int n = names.length;

        for(int i = 0; i < n; i++){
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        for(int i = n - 1; i >= 0; i--){
            names[n - i - 1] = map.get(heights[i]);  // n - i - 1 -> index from 0
        }

        return names;
    }

    public static void main(String[] args) {
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}

// TC - O(n log n)
// SC - O(n)

// LC - 2418 - https://leetcode.com/problems/sort-the-people/description/