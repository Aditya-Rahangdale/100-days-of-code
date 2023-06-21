class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0, k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count<2){
                    nums[k++]=nums[i];
                }
            }
            else{
                nums[k++]=nums[i];
                count=0;
            }
        }
        return k;
        
    }
}