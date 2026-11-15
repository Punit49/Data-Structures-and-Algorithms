class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        char greatestLetter = letters[0];
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(letters[mid] > target){
                greatestLetter = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return greatestLetter;
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
}