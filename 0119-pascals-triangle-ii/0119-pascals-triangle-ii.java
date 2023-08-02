class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();
        if(rowIndex<0){
            return list;
        }
        list.add(1);
        for(int i=1; i<=rowIndex; i++){
            for(int j=list.size()-2; j>=0; j--){
                 list.set(j + 1, list.get(j) + list.get(j + 1));
                
            }
            list.add(1);
        }
        return list;
    }
}