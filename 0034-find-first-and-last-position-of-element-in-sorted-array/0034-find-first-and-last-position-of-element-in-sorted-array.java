class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ar = new int[2];
        
        ar[0] = binary(nums,target,true);
        ar[1] = binary(nums,target,false);
        return ar;
    }
    int binary(int[] nums,int target,boolean isFirstHalf){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(nums[m] == target){
                ans = m;
                if(isFirstHalf){
                    e= m - 1;
                }else{
                    s = m + 1;
                }
            }else if(nums[m] < target){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return ans;
    }
}