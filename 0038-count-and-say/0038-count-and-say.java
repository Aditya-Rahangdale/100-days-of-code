class Solution {
    public String countAndSay(int n) {
        if(n<=0){
            return "";
        }
        String r = "1";
        for(int i=1;i<n;i++){
            StringBuilder adi = new StringBuilder();
            int c =1;
            for(int j=1;j<r.length();j++){
                if(r.charAt(j) == r.charAt(j-1)){
                    c++;
                }else{
                    adi.append(c).append(r.charAt(j-1));
                    c=1;
                }
            }
            adi.append(c).append(r.charAt(r.length()-1));
            r = adi.toString();
        }
        return r;
        
    }
}