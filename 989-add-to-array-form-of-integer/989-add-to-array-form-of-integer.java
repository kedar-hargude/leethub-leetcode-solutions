class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int callback = 0;
        List<Integer> answerList = new ArrayList<>();
        for(int i = num.length - 1; i >= 0; i--){
            if(k == 0 && callback == 0){
                answerList.add(0, num[i]);
            } else {
                int lastNumber = k % 10;
                int currentSum;
                if (callback == 1){
                    currentSum = num[i] + lastNumber + callback;
                    callback = 0;
                } else {
                    currentSum = num[i] + lastNumber;
                }

                if(currentSum > 9){
                    callback = 1;
                    currentSum %= 10;
                }
                answerList.add(0, currentSum);
                k /= 10;
            }

        }

        if(k > 0){
            while(k > 0){
                int lastNumber = k % 10;
                if(callback == 1){
                    int currentSum = lastNumber + callback;
                    callback = 0;
                    if(currentSum > 9){
                        callback = 1;
                        currentSum %= 10;
                    }

                    answerList.add(0, currentSum);

                } else {
                    answerList.add(0, lastNumber);
                }
                k /= 10;
            }
        }

        if(callback == 1){
            answerList.add(0, 1);
        }

        return answerList;
    
    }
}