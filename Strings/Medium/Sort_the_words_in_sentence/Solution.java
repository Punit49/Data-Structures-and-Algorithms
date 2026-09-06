class Solution {
    public static String sort(String s) {
       String[] strArr = s.split(" ");
       String newStr = "";

       for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < strArr.length - i - 1; j++){
                if(strArr[j].compareTo(strArr[j + 1]) > 0){
                    String temp = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = temp;
                }
            }

            newStr = strArr[strArr.length - i - 1] + " " + newStr;
       }
        
       return newStr;
    }
    public static void main(String[] args) {
        String str = "taj mahal is situated at Agra";
        System.out.println(sort(str));
    }
}

// TC - O(m^2) m = number of words - 
// SC - O(n) n = length of string -