class Solution {
   public  String []key = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public ArrayList<String> val(String digits,int idx,ArrayList<String> empty,String combination ){
        if(digits.length() ==0){
            return empty;
        }
        if(idx==digits.length()){
        empty.add(combination);
        return empty;
        }
    char c = digits.charAt(idx);
    String map = key[c-'1'];
    for(int i=0;i<map.length();i++){
        val(digits,idx+1,empty,combination+map.charAt(i));
    }
    return empty; }
    public List<String> letterCombinations(String digits) {
        ArrayList<String>a = new ArrayList<>();
        return val(digits,0,a,""); 
    }
}
