class Solution {
    public boolean judgeSquareSum(int c) {
        long s=0;
        long e=(long)Math.sqrt(c);
        while(s<=e){
            if(s*s+e*e==c) return true;
            if(s*s+e*e<c){
                s++;
                
            }
            else{
                e--;
            }
        }
        return false;
    }
}