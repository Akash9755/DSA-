class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
         solve(nums,0,new ArrayList<>(),set);
         return new ArrayList<>(set);
    }
    private void solve(int [] nums,int index,List<Integer> subset,Set<List<Integer>> set){
        List<Integer> current = new ArrayList<>(subset);
        Collections.sort(current);
         set.add(current);

         int n = nums.length;
         for(int i=index; i<n; i++){
            subset.add(nums[i]);
         solve(nums,i+1,subset,set);
          subset.remove(subset.size()-1);
         }
    }
}