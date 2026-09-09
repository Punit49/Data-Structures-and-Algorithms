import java.util.Arrays;

class Solution {
    public static boolean checkIfPangram(String sentence) {
        int arr[] = new int[26];

        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            int index = ch - 97;
            arr[index]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}

// TC - O(n)
// SC - O(1)


// LC - 1832 - https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

