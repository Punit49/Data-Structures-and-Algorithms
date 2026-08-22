class Main {
    public int countNumbersWithXDivisors(int n, int x) {
        int count = 0;

        for(int i = 1; i <= n; i++){
            int divCount = 0;
            for(int j = 1; j * j <= i; j++){
                if(i % j == 0){
                    if(i / j == j) divCount++;
                    else divCount += 2;
                }
            }
            if(divCount == x) count++; 
        }

        return count;
    }
}