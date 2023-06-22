class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
       int ans=(nums[nums.length-1]-k)-(nums[0]+k);
        if(ans<0) return 0;
        return ans;
        
    }
}