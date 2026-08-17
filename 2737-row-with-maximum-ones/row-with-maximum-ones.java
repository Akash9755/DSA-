class Solution {
    public int lowerbound(int[] nums,int n, int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int cmt_max =0;
        int index = 0;
        for(int i=0; i<n; i++){
            int [] row = mat[i].clone();
            Arrays.sort(row);
            int cmt_ones = m- lowerbound(row,m,1);
                if(cmt_ones>cmt_max){
                    cmt_max = cmt_ones;
                    index = i;
                }
            }
          return new int[]{index,cmt_max};
          
        }
    }
