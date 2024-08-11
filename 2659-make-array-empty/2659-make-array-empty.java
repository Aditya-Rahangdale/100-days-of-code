class Solution {
    public long countOperationsToEmptyArray(int[] arr) {
        long n=arr.length;
        long res=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<n; i++){
           map.put(arr[i],i);
        }
        Arrays.sort(arr);
        for(int i=1; i<n; i++){
          if(map.get(arr[i])<map.get(arr[i-1])){
              res+=n-i;
          }
        }
        return res;
    }
}