import java.util.Arrays;

public class Optimized{
    public static int longestSubstring(String str){
        int n = str.length();
        int[] lastSeen = new int[256];
        int maxLength = 0;
        int l = 0, r = 0;
        Arrays.fill(lastSeen, -1);

        while(r < n){
            char ch = str.charAt(r);
            if(lastSeen[ch] != -1 && lastSeen[ch] >= l){
                l = lastSeen[ch] + 1;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            lastSeen[ch] = r;
            r++;
        }

        return maxLength;
    }
    public static void main(String[] args){
        String str = "abccaddb";
        System.out.println(longestSubstring(str));
    }
}

// Time Complexity -> O(n)
// Space Complexity -> O(1)