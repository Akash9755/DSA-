class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(k,1,n,new ArrayList<>(),ans);
        return ans;
    }
    private void solve(int k, int index ,int n, List<Integer> subset,List<List<Integer>> ans){
            if(subset.size() == k){
               if(n == 0){
                ans.add(new ArrayList<>(subset));
               }
               return;
            }
            for(int i=index; i<=9; i++){
                subset.add(i);
                solve(k,i+1,n-i,subset,ans);
                subset.remove(subset.size()-1);
            }
    }
}