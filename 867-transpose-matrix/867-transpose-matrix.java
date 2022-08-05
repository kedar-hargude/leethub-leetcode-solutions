class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] newArray = new int[c][r]; // int[rows][columns]

        for (int i = 0; i < r; i++) {
            //rows = 2
            for (int j = 0; j < c; j++) {
                //columns = 3
                newArray[j][i] = matrix[i][j];
            }
        }
        return newArray;
    }
}