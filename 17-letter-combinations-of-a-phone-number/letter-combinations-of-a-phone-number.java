class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         solve(digits,0,"",phone,ans);
         return ans;
    }
     private void solve(String digits ,int index,String current,String[] phone,List<String> ans){
            if(digits.length()==index){
                ans.add(current);
                return;
            }
            int digit = digits.charAt(index)-'0';
            String letter = phone[digit];
                for(int j=0; j<letter.length(); j++){
                    char ch = letter.charAt(j);
                    solve(digits,index+1,current+ch,phone,ans);
                }
    }
}
