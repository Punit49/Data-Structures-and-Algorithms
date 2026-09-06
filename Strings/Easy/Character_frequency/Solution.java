class Solution {
    public static void calculateFreq(String s) {
       int[] bitMap = new int [26];
       int baseValue = 97;

       for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch != ' '){
                bitMap[ch - baseValue]++;
            }
       }  

       for(int i = 0; i < bitMap.length; i++){
            int val = bitMap[i];

            if(val > 0){
                System.out.println((char)(baseValue + i) + ": " + val);
            }
       }  
    }
    public static void main(String[] args) {
        String str = "i love programming";
        calculateFreq(str);
    }
}