class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    private void solve(int[] candidates,int index , int target,List<Integer> current,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index == candidates.length){
            return;
        }
        if(candidates[index] <= target){
            current.add(candidates[index]);

            solve(candidates,index,target - candidates[index],current,ans);
            current.remove(current.size()-1);
        }
        solve(candidates,index+1,target,current,ans);
    }
}