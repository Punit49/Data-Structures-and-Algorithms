import java.util.Arrays;

class Bruteforce {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        for(int i = 0; i < n - 1; i++){
           for(int j = 0; j < n - i - 1; j++){
                if(heights[j] < heights[j + 1]){
                    int tempNum = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempNum;
                    String tempStr = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempStr;
                }
           }
        }
        return names;
    }
    public static void main(String[] args) {
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}

// TC - O(n^2) 
// SC- O(n)

