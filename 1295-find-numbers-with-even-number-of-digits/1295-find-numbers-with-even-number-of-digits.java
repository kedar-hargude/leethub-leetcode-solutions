class Solution {
    public int findNumbers(int[] nums) {
        int answerCount = 0;
        // finding the number of digits
        for(int num: nums){
            int digitCount = 0;
            while (num > 0){
                num /= 10;
                digitCount += 1;
            }
            if(digitCount % 2 == 0){
                answerCount += 1;
            }
        }
        return answerCount;
    }
}