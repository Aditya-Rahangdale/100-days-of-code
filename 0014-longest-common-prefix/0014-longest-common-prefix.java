class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        for(int i=0; i<strs[0].length(); i++){
            for(int j=1; j<strs.length; j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        
        
        return sb.toString();  
    }
}