class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
          ans.add("");
          for(int i=0; i<digits.length(); i++){
            int digit = digits.charAt(i)-'0';
            String letter = phone[digit];
            List<String> next = new ArrayList<>();
            for(String str : ans){
                for(int j=0; j<letter.length(); j++){
                    next.add(str + letter.charAt(j));
                }
            }
            ans = next;
          }
        return ans;
    }
}