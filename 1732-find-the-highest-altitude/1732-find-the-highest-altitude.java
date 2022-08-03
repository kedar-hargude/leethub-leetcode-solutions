class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for(int gained: gain){
            altitude += gained;
            max = Math.max(altitude, max);
        }
        return max;
    }
}