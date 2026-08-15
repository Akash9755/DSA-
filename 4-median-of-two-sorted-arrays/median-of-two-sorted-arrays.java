class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n1= nums1.length;
         int n2= nums2.length;
          int[] nums3 = new int[n1+n2];
         int i=0;
         int j=0;
         while(i<n1 && j<n2){
            if(nums1[i]<nums2[j])
                nums3[i+j]=nums1[i++];
                else nums3[i+j]=nums2[j++];
         }
         while(i<n1) nums3[i+j]=nums1[i++];
         while(j<n2) nums3[i+j]=nums2[j++];
         int n = (n1+n2);
         if(n%2==1){
            return nums3[n/2];
         }
         return (double)((double)(nums3[n/2])+(double)(nums3[n/2-1]))/2.0;
    }
}