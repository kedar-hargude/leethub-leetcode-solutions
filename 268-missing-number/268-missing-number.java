class Solution {
    public int missingNumber(int[] nums) {
        float n = nums.length;
        int total = Math.round((n/2) * (1 + n));
        for (int i = 0; i < n; i++){
            total -= nums[i];
        }
        return total;
    }
}