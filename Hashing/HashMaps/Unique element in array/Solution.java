import java.util.*;

public class Solution {
    public static List<Integer> printUnique(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(Integer key: map.keySet()){
            if(map.get(key) == 1) list.add(key);
        }

        if(list.size() == 0) list.add(-1);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 2, 10, 4, 5, 6, 1, 4};
        System.out.println(printUnique(arr));
    }
}


// TC - O(n)
// SC - O(n)

// Sheryians - https://classroom.sheryians.com/platform/coding_problem?batchId=69b2c629d92ec16308d1a4c8&submoduleId=6a2d738530abcef27247ad8f&contentId=68ca5f633aa498cbe507d6d8