class Solution {
    public int reverse(int x) {
        
    int a=0;
    int r;
    while(x!=0){
        r=x%10;
        x=x/10;
        if(a>Integer.MAX_VALUE/10 || a==Integer.MAX_VALUE/10 && r>7){
            return 0;
        }
        if(a<Integer.MIN_VALUE/10 || a==Integer.MIN_VALUE/10 && r<-8){
            return 0;
          
        }
          a=(a*10)+r;
    }
    return a;
    
    }
       
}