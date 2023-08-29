class Solution {
    public List<String> generateParenthesis(int n) {
        String s="";     
        Set<String> hs= new HashSet<String>();
        generate(hs,s,n,n,'(');
        List<String> ans=new ArrayList<String>(hs);
        return ans;
    }

    public void generate(Set<String> hs, String s, int open, int close, char ch)
    {
        if(open<0||close<0||close<open)
        {
            return;
        }
        if(open==0 && close==0)
        {
            hs.add(s);
        }

        s=s+ch;
        if(ch=='(')
        {
            open--;
        }
        else 
        {
            close--;
        }
        generate(hs,s,open,close,'(');
        generate(hs,s,open,close,')');
        
    }
}