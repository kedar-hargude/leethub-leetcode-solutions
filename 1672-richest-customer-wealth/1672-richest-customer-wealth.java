class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;       
        for(int[] row: accounts){
            if(arraySum(row) > max){
                max = arraySum(row);
            }
        }
        return max;
    }
    
    int arraySum(int[] row){
        int sum = 0;
        for(int element: row){
            sum += element;
        }
        return sum;
    }
}