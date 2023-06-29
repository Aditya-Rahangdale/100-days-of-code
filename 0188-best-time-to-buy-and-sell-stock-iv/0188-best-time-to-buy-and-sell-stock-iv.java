class Solution {
    public int maxProfit(int k, int[] prices) {
        if(k==0) return 0;
        int [] b=new int[k];
        int [] s=new int[k];
        
        Arrays.fill(b, Integer.MIN_VALUE);
        Arrays.fill(s,0);
        for(int i:prices){
            b[0]=Math.max(b[0], i*-1);
             s[0]=Math.max(s[0], b[0]+i);
            for(int j=1; j<k; j++){
                b[j]=Math.max(b[j], s[j-1]- i );
                s[j]=Math.max(s[j], b[j]+i );

            }

            
        }
        return s[k-1];
    
    }
}