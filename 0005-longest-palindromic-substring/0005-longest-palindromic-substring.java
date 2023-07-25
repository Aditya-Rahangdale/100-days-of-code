class Solution {
    public String longestPalindrome(String s) {
        int start=0, end=0;
       for(int i=0;i<s.length(); i++){
           int odd=pal(s,i,i);
           int even=pal(s,i,i+1);
           int len=Math.max(odd,even);

           if(len>end-start){
               start=i-(len-1)/2;
               end=i+len/2;
           }
       } 
       return s.substring(start,end+1);
    }
    public int pal(String str,int s,int e){
        while(s>=0 && e<str.length() && str.charAt(s)==str.charAt(e)){
            s--;
            e++;
        }
        return e-s-1;

        
    }
}