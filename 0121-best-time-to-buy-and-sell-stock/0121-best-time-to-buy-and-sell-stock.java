class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int op=0,p=0;
        
        for(int i=0; i<prices.length; i++){
            if(buy<prices[i]){
                p=prices[i]-buy;
            op=Math.max(op,p);
            }
            else{
                buy=prices[i];
            }
        }
        return op;
        
    }
}