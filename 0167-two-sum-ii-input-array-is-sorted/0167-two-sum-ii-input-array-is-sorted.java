class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
        int lp=0;
        int rp=nums.length-1;
        while(lp<=rp){
             if(nums[lp]+nums[rp]==target){
                 ans[0]=lp+1;
                 ans[1]=rp+1;
                 return ans;
             }
        else if(nums[lp]+nums[rp]<target){
                 lp++;
        }
        else{
            rp--;
        }
        }
        return ans;
    }
}