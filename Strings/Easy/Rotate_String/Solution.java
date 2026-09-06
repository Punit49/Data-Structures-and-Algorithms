class Solution {
    public static String leftRotate(String s){
        String str = "";
        char ch = s.charAt(0);

        for(int i = 1; i < s.length(); i++){
            str += s.charAt(i);
        }

        return str + ch;
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        for(int i = 0; i < s.length(); i++){
            s = leftRotate(s);
            if(s.equals(goal)) return true;
        }
        return false;
    }   
    public static void main(String[] args){
        System.out.println(rotateString("abcde", "cdbea"));
    }
}

// LC - 796
// TC - O(n^2)
// SC - O(n)
