class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for(int gained: gain){
            altitude += gained;
            if(altitude > max){
                max = altitude;
            }
        }
        return max;
    }
}