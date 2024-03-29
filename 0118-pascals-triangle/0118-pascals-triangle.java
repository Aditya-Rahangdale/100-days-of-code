class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> nums=new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            List<Integer>list=new ArrayList<>();
            for(int j=1; j<=i; j++){
                if(j==1|| j==i){
                    list.add(1);
                }
                else{
                    list.add(nums.get(i-2).get(j-1)+nums.get(i-2).get(j-2));
                }
            }
            nums.add(list);
        }
        return nums;
        
    }
}