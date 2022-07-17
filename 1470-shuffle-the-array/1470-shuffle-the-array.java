class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for (int i = 0, j = 0; i < nums.length - 1; i += 2, j++){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
        }

        return ans;
    }
}