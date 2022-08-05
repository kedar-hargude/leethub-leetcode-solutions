class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] newArray = new int[matrix[0].length][matrix.length]; // [rows] [columns]

        for (int i = 0; i < matrix.length; i++) {
            //rows = 2
            for (int j = 0; j < matrix[0].length; j++) {
                //columns = 3
                newArray[j][i] = matrix[i][j];
            }
        }
        return newArray;
    }
}