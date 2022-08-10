class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> answerList = new ArrayList<>();
        for(int[] row: matrix){
            int[] lowestArray = findLowestinArray(row); //[lowestNum, lowestIndex]
            int lowestNum = lowestArray[0];
            int lowestIndex = lowestArray[1];
            int highestInSameColumn = findHighestInColumn(lowestIndex, matrix);
            if(lowestNum == highestInSameColumn){
                answerList.add(lowestNum);
            }
        }
        return answerList;
    }

    static int[] findLowestinArray (int[] arr){
        int min = 100001;
        int index = 0;
        int[] answerArray = new int[2]; // [lowestNum, lowestIndex]
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
                answerArray[0] = arr[i];
                answerArray[1] = i;
            }
        }
        return answerArray;
    }

    static int findHighestInColumn (int columnNumber, int[][] matrix){
        int highest = 0;
        for(int[] row : matrix){
            highest = Math.max(row[columnNumber], highest);
        }
        return highest;
    }
}