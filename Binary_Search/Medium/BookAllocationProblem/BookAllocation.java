public class BookAllocation{
    public static int calculateAllocation(int[] books, long limit){
        int student = 1;
        int allocatedBooks = 0;

        for(int page: books){
            if(page + allocatedBooks <= limit){
                allocatedBooks += page;
            } else {
                student++;
                allocatedBooks = page;
            }
        }
        return student;
    }
    public static int allocateBooks(int[] books, int k){
        if (k > books.length) return -1;
        long first = 0;
        long last = 0;
        long ans = -1;

        for(int page: books){
            last += page;
            first = Math.max(first, page);
        }

        while(first <= last){
            long mid = first + (last - first) / 2;
            
            if(calculateAllocation(books, mid) <= k){
                ans = mid;
                last = mid - 1; 
            } else {
                first = mid + 1;
            }
        }


        return (int) ans;
    }
    public static void main(String[] args) {
        int[] books = {10, 20, 30, 40};
        int students = 2;    
        System.out.println(allocateBooks(books, students));
    }
}

// Time  - O(n * log(sum - max))
// Space - O(1)
// GFG -> https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1