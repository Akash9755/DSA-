class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int ans = 0;
       int low =1; int high =x/2;
       while(low<=high){
        long mid = (low+high)/2;
        if((long)(mid*mid)<=x){
            ans =(int) mid;
            low =(int) mid +1;
        }
        else {
            high = (int)mid-1;
        }
       }
        return ans;
    }
}