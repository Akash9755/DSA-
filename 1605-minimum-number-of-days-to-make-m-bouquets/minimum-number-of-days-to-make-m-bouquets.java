import java.util.*;

class Solution {
    public static boolean canMake(int[] bloomDay, int day, int m, int k) {
        int cmt = 0;
        int bouq = 0;
        int n = bloomDay.length;
        for (int i = 0; i <= n - 1; i++) {
            if (bloomDay[i] <= day) {
                cmt++;
            } else {
                bouq += (cmt / k);
                cmt = 0;
            }
        }
        bouq += (cmt / k);
        return bouq >= m;
    }

    public static int minDays(int[] bloomDay, int m ,int k){
         long totalflowers = (long) m*k;
         if(totalflowers>bloomDay.length) return -1;

         int minDay = Integer.MAX_VALUE;
         int maxDay = Integer.MIN_VALUE;

         for(int bloom:bloomDay){
            minDay = Math.min(minDay,bloom);
            maxDay = Math.max(maxDay,bloom);
         }
         int low = minDay;
         int high = maxDay;
         int ans = -1;
         while(low<=high){
            int mid = (low+high)/2;
            if(canMake(bloomDay,mid,m,k)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
         }
         return ans;
    }
}