class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(result.size()==0 || result.get(0)!=nums[i] && (result.size()<2 || result.get(1)!=nums[i])){
                int cmt=0;
                for(int j=0; j<n; j++){
                    if(nums[j]==nums[i]){
                        cmt++;
                    }
                }
                if(cmt>n/3){
                    result.add(nums[i]);
                }
            }
            if(result.size()==2){
                break;
            }
        }
        return result;
    }
}