class Solution {
    static int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr: image){
            flipImage(arr);
            convertImage(arr);
        }
        return image;
    }

    static int[] flipImage(int[] singleArray){
        int start = 0;
        int end = singleArray.length - 1;
        while(start <= end){
        int temp = singleArray[start];
        singleArray[start] = singleArray[end];
        singleArray[end] = temp;
        start++;
        end--;
        }
        return singleArray;
    }

    static int[] convertImage(int[] singleArray){
        for(int i = 0; i < singleArray.length; i++){
            if(singleArray[i] == 0){
                singleArray[i] = 1;
            } else singleArray[i] = 0;
        }
        return singleArray;
    }
}