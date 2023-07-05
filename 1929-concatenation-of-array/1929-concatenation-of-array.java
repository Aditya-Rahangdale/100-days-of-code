class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] n=new int [2*nums.length];
        for(int i=0; i<nums.length; i++){
            n[i]=nums[i];
            n[i+nums.length]=nums[i];
        }
        return n;
    }
}