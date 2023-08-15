class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1 || numRows>=s.length())return s;

        int d1 = 2*(numRows-1);
        int d2 = 0;
        StringBuilder sb= new StringBuilder("");
        
        for(int sa=0;sa<numRows;sa++){         
            for(int next=sa;next<s.length();){
                if(d1>0){
                    sb.append(s.charAt(next));
                    next=next+d1;
                }            
                if(d2>0 && next<s.length()){
                    sb.append(s.charAt(next));
                    next = next+d2;
                }            
            }
            d1 = d1-2;
            d2 = d2+2;
        }
        return sb.toString();
    }
}