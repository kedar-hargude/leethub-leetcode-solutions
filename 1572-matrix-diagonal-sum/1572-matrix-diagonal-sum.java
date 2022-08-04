class Solution {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1) {
            return mat[0][0];
        }

        int start = 0;
        int end = mat.length - 1;
        int sum = 0;
        while(end >= 0){
            for(int i = 0; i < mat.length; i++){

                if(start == end){
                    sum += mat[i][start];
                } else {
                    sum += mat[i][start] + mat[i][end];
                }
                start++;
                end--;
            }
        }
        return sum;
    }
}