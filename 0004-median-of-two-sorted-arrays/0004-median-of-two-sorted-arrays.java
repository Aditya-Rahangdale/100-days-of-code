class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int y=a+b;
        int c=0;
        int a3[]=new int[y];
        for(int i=0;i<a;i++)
        {
            a3[c]=nums1[i];
            c++;
        }
        for(int i=0;i<b;i++)
        {
            a3[c]=nums2[i];
            c++;
        }
        Arrays.sort(a3);
        if (y%2==0) return (float)(a3[y/2-1] + a3[y/2])/2;
        else return a3[y/2];
        
    }
}