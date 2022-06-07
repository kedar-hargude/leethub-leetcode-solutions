class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //we've entered the descending part of the array
                //the peak can be at the left too
                end = mid;
            }
            else{
                //we've entered the ascending part of the array
                start = mid + 1;
            }
        }
        return start;
    }
}