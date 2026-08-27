class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int totalsize=n+m;
        int[] arr=new int[totalsize];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums1[i];
        }
         for(int i=0;i<m;i++)
        {
            arr[n + i]=nums2[i];
        }
        Arrays.sort(arr);
        double ans;
        if(totalsize%2!=0)
        {
            ans= arr[totalsize/2];
        }
        else
        {
            ans=(double)(arr[totalsize/2] + arr[totalsize/2-1])/2;
        }
        return ans;

    }
}