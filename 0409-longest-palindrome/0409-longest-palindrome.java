class Solution {
    public int longestPalindrome(String s) {
        int[] ans = new int[128];

       for(char c: s.toCharArray()){
           ans[c]++;
       } 

       boolean o = false;
       int l = 0;
       for(int c: ans){
           if(c%2==0){
               l += c;
           }
           else{
               l += c -1;
               o= true;
           }
       }
       if(o){
           l++;
       }
       return l;
        
    }
}