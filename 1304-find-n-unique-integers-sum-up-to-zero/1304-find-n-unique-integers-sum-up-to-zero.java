class Solution {
    public int[] sumZero(int n) {
        int[] answer = new int[n];
        int value = n/2;
        for(int i = 0; i < n/2; i++){
            answer[i] = -value;
            answer[n-1-i] = value;
            value--;
        }
        return answer;
    }
}