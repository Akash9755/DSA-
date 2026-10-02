class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);
            solve(candidates, i + 1, target - candidates[i], current, ans);
            current.remove(current.size() - 1);
        }

    }
}
