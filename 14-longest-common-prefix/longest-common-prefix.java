class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int n = strs[0].length();
        int m = strs.length;
        for(int i=0; i<n; i++){
            char ch = strs[0].charAt(i);
            for(int j=1; j<m; j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return result.toString();
                }
            }
            result.append(ch);
        }
        return result.toString();
    }
}