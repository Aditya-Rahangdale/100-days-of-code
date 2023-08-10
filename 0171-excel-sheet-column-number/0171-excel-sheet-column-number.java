class Solution {
    public int titleToNumber(String columnTitle) {
         String str = columnTitle;
        int result = 0;
        int x =str.length();
        for(int i = 0;i<str.length();i++){
            if(x>1){
                result= result + ((int)Math.pow(26,x-1)*((int)str.charAt(i)-64));
            }
            else{
                result = result + ((int)str.charAt(i)-64);
            }
            x--;
            
        }
        return result;
        
    }
}