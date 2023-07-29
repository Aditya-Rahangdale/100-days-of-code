class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>>list= new HashSet<>();
        Arrays.sort(nums);
    long t = (long)target;
    for(int i = 0; i<nums.length; i++){
        for(int j = i+1; j<nums.length; j++){
            
            int k = j+1;
            int l = nums.length-1;
            
            while(k < l){
                List<Integer>ans = new ArrayList<>();
                long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                
                if(sum == t){
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    ans.add(nums[l]);
                    
                    list.add(ans);
                    
                    k++;
                    l--;
                }
                else if(sum > target){
                    l--;
                }
                else{
                    k++;
                }
            }
        }
    }
    return new ArrayList(list);
        
    }
}