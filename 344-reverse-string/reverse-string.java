class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        solve(s,left,right);
    }
    private void solve(char[]s,int left,int right){
        if(left>=right){
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
      solve(s,left+1,right-1);
    }
}