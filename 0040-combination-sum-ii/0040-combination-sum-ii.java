class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans,new ArrayList<>(),candidates,target,0);
        return ans;
        
    }
    static void helper(List<List<Integer>>ans, List<Integer>templist,int[]nums,int target, int start ){
        if(target<0) return;
        if(target==0) {
            ans.add(new ArrayList<>(templist));
        }
        else{
            for(int i=start; i<nums.length; i++){
                
                if(i>start && nums[i]==nums[i-1]) continue;
                templist.add(nums[i]);
                helper(ans,templist,nums,target-nums[i],i+1);
                templist.remove(templist.size()-1);
            }
        }
    }
}