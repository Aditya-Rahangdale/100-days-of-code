class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> l = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int h = nums.length - 1;
            while (low < h) {
               int sum = nums[i] + nums[low] + nums[h];
                if (sum == 0) {
                    l.add(Arrays.asList(nums[i], nums[low], nums[h]));
                }
                if (sum > 0) {
                    h--;
                } else {
                    low++;
                }
            }
        }
        return new ArrayList<>(l);
        
    }
}