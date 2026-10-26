import java.util.HashMap;
import java.util.HashSet;

public class Bruteforce{
    // ? HashSet - 
    // public static int longestSubstring(String str){
    //     int ans = 0;
    //     int n = str.length();

    //     for(int i = 0; i < n; i++){
    //         HashSet<Character> set = new HashSet<>();
    //         int length = 0;
    //         for(int j = i; j < n; j++){
    //             char ch = str.charAt(j);
    //             if(!set.contains(ch)){
    //                 length++;
    //                 ans = Math.max(ans, length);
    //             } else break;
    //             set.add(ch);
    //         }
    //     }
    //     return ans;
    // }

    // ? Array/Hashmap - 
    public static int longestSubstring(String str){
        int ans = 0;
        int n = str.length();
        int[] lastSeen = new int[256];

        for(int i = 0; i < n; i++){
            Arrays.fill(lastSeen, 0);
            for(int j = i; j < n; j++){
                if(lastSeen[str.charAt(j)] == 1) break;
                ans = Math.max(j - i + 1, ans);
                lastSeen[str.charAt(j)] = 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String str = "abccaddb";
        System.out.println(longestSubstring(str));
    }
}

// Time and Space Complexity
// 1. Hashset -
        // * Time -> O(n)
        // The outer loop runs n times.
        // The inner loop runs at most n times.
        // HashSet.contains() and HashSet.add() take O(1) average time.

        // * Auxiliary Space Complexity: O(n)
        // - In the worst case, the HashSet stores up to n distinct characters.
        // - Only one HashSet exists at a time because a new set is created for each iteration of the outer loop.
        // Therefore, auxiliary space complexity is O(n).

// 2. HashMap
    // ? Time complexity: O(n² + 256n) = O(n²)
    //     - The outer loop runs n times.
    //     - Resetting the array costs O(256) per iteration.
    //     - The inner loop runs at most n times per iteration.

    // ? Auxiliary space: O(1) because the array has a fixed size of 256.