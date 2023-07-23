class Solution {
    public boolean isValid(String s) {
        char[] cha = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < cha.length; i++ ){
            if( cha[i] == '(' || cha[i] == '{' || cha[i] == '[')
                stack.push(cha[i]);
            else if(!stack.empty() && Math.abs(cha[i] - stack.peek()) <= 2){
                stack.pop();
            }      
            else return false;
        }
        
        return stack.empty();
    }
}