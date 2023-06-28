class Solution {
    public int maxProfit(int[] prices) {
        int b1=Integer.MAX_VALUE;
        int b2=Integer.MAX_VALUE;
        int s1=0;
        int s2=0;
        for(int p:prices){
            b1=Math.min(b1,p);
            s1=Math.max(s1,p-b1);
            b2=Math.min(b2,p-s1);
            s2=Math.max(s2,p-b2);
        }
        return s2;
        
    }
}