class Solution {
    public void nextPermutation(int[] nums) {
         Stack<Integer> stc  = new Stack<>();
        for(int i=nums.length-1; i>=0; i--) {
            
            if(stc.size() > 0 && nums[stc.peek()] > nums[i]) {
                int a = i;
                int b = stc.pop();

                while(stc.size() > 0 && nums[stc.peek()] > nums[i] && nums[stc.peek()] <= nums[b]) {
                    b = stc.pop();
                }

                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;

                Arrays.sort(nums, a+1, nums.length);
                return;

            }

            stc.push(i);
            
        
        }


        Arrays.sort(nums);
        return;
       
        
    }
}