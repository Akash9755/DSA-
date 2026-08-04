import java.util.*;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int MaxVal = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = MaxVal;
        int ans = MaxVal;
        while (low <= high) {
            int mid = (low + high) / 2;
            long hours = calculateTotalhours(piles, mid);
            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public long calculateTotalhours(int[] piles, int speed) {
      long hours = 0;
        for (int bananas : piles) {
            hours += (int) Math.ceil((double) bananas / speed);
        }
        return hours;
    }
}