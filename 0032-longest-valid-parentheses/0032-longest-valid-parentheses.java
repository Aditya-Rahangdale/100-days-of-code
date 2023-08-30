class Solution {
    public int longestValidParentheses(String s) {
         Stack<Character> as = new Stack<>();
         Stack<Integer> In= new Stack<>();
         In.push(-1);
         int r=0;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='('){
                 as.push('(');
                 In.push(i);
             }
             else{
                 if(as.size()!=0){
                     as.pop();
                     In.pop();
                     r = Math.max(r,i-In.peek());
                 }
                 else{
                     In.push(i);
                 }
             }
         }
         return r;
        
    }
}