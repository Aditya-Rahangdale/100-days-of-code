class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuilder sb=new StringBuilder();
        String prefix="";
        Arrays.sort(strs);
        for(int i=0; i<strs[0].length(); i++){
            for(int j=1; j<strs.length; j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    return prefix;
                }
            }
            prefix+=strs[0].charAt(i);
        }
        
        
        return prefix;  
    }
}