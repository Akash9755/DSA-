class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int cmt_max =0;
        int index = 0;
        for(int i=0; i<n; i++){
            int cmt_ones = 0;
            for(int j=0; j<m; j++){
                cmt_ones += mat[i][j];
            }
                if(cmt_ones>cmt_max){
                    cmt_max = cmt_ones;
                    index = i;
                }
            }
          return new int[]{index,cmt_max};
          
        }
    }
