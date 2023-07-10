class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int c=nums[i]-1;
            if(nums[i]!=nums[c]){
                swap(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
            return new int[] {nums[index],index+1};
        }
        }
        return new int[]{-1,-1};
        
    }
    static void swap(int[]arr, int i, int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}