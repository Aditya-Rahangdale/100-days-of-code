class Solution {
    public int climbStairs(int n) {
        if(n==1){
          return 1;
        }
        int ar[]=new int[n];
        ar[0]=1;
        ar[1]=2;
        for(int i=2; i<n; i++){
           ar[i]=ar[i-1]+ar[i-2]; 
        }
        return ar[n-1];
    }
}