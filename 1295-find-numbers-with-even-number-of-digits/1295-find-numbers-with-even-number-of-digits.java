class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int element: nums){
            if(checkEvenDigits(element)){
                count++;
            }
        }
        return count;
    }
    
    static boolean checkEvenDigits(int element){
        if(element < 0){
            element *= -1;
        }
        if(element == 0){
            return false;
        }
        int numberOfDigits = (int)(Math.log10(element)) + 1;        
        return (numberOfDigits%2 == 0);
    }
}