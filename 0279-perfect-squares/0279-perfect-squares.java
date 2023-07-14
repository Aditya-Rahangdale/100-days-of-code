class Solution {
    public int numSquares(int n) {
        int[] v = new int[n + 1];
        v[1] = 1;
        int m, sq;
        for (int i = 1; i <= n; i++) {
            m = n;
            sq = (int) Math.sqrt(i);
            for (int j = 1; j <= sq; j++) {
                m = Math.min(m, v[i - j * j]);
            }
            v[i] = 1 + m;
        }
        return v[n];
        
    }
}