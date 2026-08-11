class Solution {
    public int subarray(int [] nums, int split){
        int partition = 1;
        long subarraysum=0;
        for(int i=0; i<nums.length; i++){
            if(subarraysum + nums[i] <=split){
                subarraysum += nums[i];
            }
            else{
                partition++;
                subarraysum = nums[i];
            }
        }
        return partition;
    }
    public int splitArray(int[] nums, int k) {
         int low=Arrays.stream(nums).max().getAsInt();
         int high=Arrays.stream(nums).sum();
         while(low<=high){
            int mid = (low+high)/2;
            int partition = subarray(nums,mid);
            if(partition>k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
         }
         return low;
    }
}