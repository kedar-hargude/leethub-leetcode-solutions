class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end ){
            int mid = start + (end-start)/2;

            //we will only be checking mid and (mid+1) values.
            if(arr[mid] > arr[mid+1]){
                //descending part of the array
                //this mid can be the answer, but look at left too. So, end!= mid-1...we may miss
                // the answer if it is the end value
                end = mid;
            }
            else{
                //ascending part of the array
                start = mid+1;
                // as we know mid+1 is greater than mid...so why waste it.
            }
        }
        return start;
    }
}