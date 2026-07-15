import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(
            intervals,
            (a, b) -> Integer.compare(a[0], b[0])
        );
        List<List<Integer>> mer = new ArrayList<>();
        int n=intervals.length;
        for(int[] interval : intervals){
            if(
            mer.isEmpty() || 
            mer.get(mer.size()-1).get(1)<interval[0]){
           mer.add(Arrays.asList(interval[0],interval[1]));
            }
            else{
                int last = mer.size()-1;
                int maxLast = Math.max(mer.get(last).get(1),interval[1]);
                mer.get(last).set(1,maxLast);
            }
        }
      return mer.stream()
           .map(l -> new int[]{l.get(0), l.get(1)})
           .toArray(int[][]::new);
        
    }
}