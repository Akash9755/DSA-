class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(nums1[i]==nums2[j]){
                    if(!result.contains(nums1[i])){
                        result.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int[] ans = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}