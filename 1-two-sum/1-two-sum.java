class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] other = {-1, -1};
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] ans = {i, j};
                    return ans;
                }
            }
        }
        return other;
    }
}