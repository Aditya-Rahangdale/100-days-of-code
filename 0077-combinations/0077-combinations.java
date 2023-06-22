class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<>(),1,n,k);
        return ans;
        
        
    }
    static void helper(List<List<Integer>> ans, List<Integer>templist, int start, int n, int k) {
        
        if(templist.size()==k){
            ans.add(new ArrayList<>(templist));
            return;
        }
        for(int i=start; i<=n; i++){
            templist.add(i);
            helper(ans,templist,i+1,n,k);
            templist.remove(templist.size()-1);
            
        }    
    }
}