class Solution {
    public int maxProfit(int[] prices) {
        int sell=Integer.MAX_VALUE, op=0, p=0; 
        for(int i=0; i<prices.length; i++){
           if(prices[i]<sell){
               sell=prices[i];
           }
            p=prices[i]-sell;
            if(op<p) {
                op=p;

            }
            
        }
        return op;
        
        
    }
}