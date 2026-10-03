import java.util.*;

public class Solution {
    public static int[][] mergeIntervals (int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // n log n
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int prev[] = list.get(list.size() - 1);
            int cur[] = intervals[i];

            if(prev[1] < cur[0]){
                list.add(cur);
            } else {
                list.get(list.size() - 1)[1] = Math.max(prev[1], cur[1]);
            }
        }

        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        } 
        return ans;
    }
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }
}

// Part	   Time	        Space
// Sort	   O(n log n)   O(log n) to O(n), depending on the sort implementation
// Merge   loop O(n)	O(n) for the result list
// Total   O(n log n)   O(n)
// Because, 2 is fixed in ans array, it is not considered as O(n^2)

// Leetcode - 56 - Merge Intervals - https://leetcode.com/problems/merge-intervals/description/

