class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] bitMap = new int[26];
        int baseValue = 97;

        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            bitMap[ch1 - baseValue]++;
            bitMap[ch2 - baseValue]--;
        }

        for(int i = 0; i < bitMap.length; i++){
            if(bitMap[i] > 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "taste";
        String s2 = "state";
        System.out.println(areAnagrams(s1, s2));
    }
}

// TC - O(n) - 
// SC - O(1) - 
