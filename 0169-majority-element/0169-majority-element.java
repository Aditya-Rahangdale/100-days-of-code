class Solution {
    public int majorityElement(int[] nums) {
        int r=nums.length;
        Arrays.sort(nums);
        return nums[r/2];
    }
}