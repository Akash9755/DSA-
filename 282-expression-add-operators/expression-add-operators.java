class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        dfs(num,target,0,0,0,"",ans);
        return ans;
    }
    private void dfs(String num,int target,int index, long curr_value,long curr_lastOperand,String expression,List<String> ans ){
        if(index == num.length()){
            if(curr_value == target){
                ans.add(expression);
            }
            return;
        }
        for(int i = index; i<num.length(); i++){
            if(i>index && num.charAt(index) == '0'){
                break;
            }
            String curr_num = num.substring(index,i+1);
            long curr_num_val = Long.parseLong(curr_num);

            if(index == 0){
                dfs(num,target,i+1,curr_num_val,curr_num_val,curr_num,ans);
            } 
            else {
                dfs(num,target,i+1,curr_value+curr_num_val,curr_num_val,expression+"+"+curr_num,ans);
                dfs(num,target,i+1,curr_value-curr_num_val,-curr_num_val,expression + "-"+curr_num,ans);
                dfs(num,target,i+1,curr_value-curr_lastOperand+curr_lastOperand*curr_num_val,curr_lastOperand*curr_num_val,expression+"*"+curr_num,ans);
            }
        }
    }
}