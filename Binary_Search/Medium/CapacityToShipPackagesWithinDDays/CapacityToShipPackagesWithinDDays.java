public class CapacityToShipPackagesWithinDDays{
    public static int calculateCapacity(int[] weights, int limit){
        int days = 1;
        int capacity = 0;

        for(int weight: weights){
            if(weight + capacity <= limit){
                capacity += weight;
            } else {
                days++;
                capacity = weight;
            }
        }
        return days;
    }
    public static int getShipWeight(int[] weights, int days){
        int start = 0;
        int end = 0;
        
        for(int weight: weights){
            start = Math.max(start, weight);
            end += weight;
        }

        int capacity = weights[0];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(calculateCapacity(weights, mid) <= days){
                capacity = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return capacity;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(getShipWeight(weights, days));
    }
}

// LC -> https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// Time  - O(n * log(sum - max))
// Space - O(1)