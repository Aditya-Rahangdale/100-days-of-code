class Solution {
    public int jump(int[] nums) {
         int n=nums.length;
     
        int ans=0;


        int l=0,r=0;
        while(r<n-1){
            int maxDistance=0;

            for(int i=l;i<=r;i++){
                maxDistance=Math.max(maxDistance,i+nums[i]);

            }

            l=r+1;
            r=maxDistance;
            ans++;

        

        }

        return ans;
        
    }
}