// LC - 771
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freq = new int[256];
        int count = 0;

        for(int i = 0; i < jewels.length(); i++){
            freq[jewels.charAt(i)] = 1;
        }

        for(int i = 0; i < stones.length(); i++){
            if(freq[stones.charAt(i)] == 1) count++;
        }
        return count;
    }
}

// TC - O(n)
// SC - O(1)
