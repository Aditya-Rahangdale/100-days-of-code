class Solution {
    public int largestAltitude(int[] gain) {
        int m=0;
        int t=0;
        for(int i=0; i<gain.length; i++){
            t+=gain[i];
            m=Math.max(m,t);
        }
        return m;
    }
}