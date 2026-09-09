class Solution {
    public static  char repeatedCharacter(String s) {
        int[] freq = new int[26];
        char result = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                int idx = ch - 97;
                freq[idx]++;
                if(freq[idx] >= 2){
                    result = ch;
                    break;
                }
        } 
        return result;
    }
    public static void main(String[] args) {
        String s = "abcbaacz";
        System.out.println(repeatedCharacter(s));
    }
}


// TC - O(n)
// SC - O(1)


// LC - 2351 - https://leetcode.com/problems/first-letter-to-appear-twice/description/

