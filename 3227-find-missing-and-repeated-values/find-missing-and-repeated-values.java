class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int missing = -1;
        int repeating =-1;
        int n = grid.length;
        for(int i=1; i<=n*n; i++){
            int cmt =0;
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                   if(grid[j][k] == i){
                        cmt++;
                }
                }
            }
            if(cmt==2){
               repeating =i;
            }
            else if(cmt==0){
                missing =i;
            }
            if(repeating!=-1 && missing!=-1){
                break;
            }
        }
       return new int[]{repeating,missing};
    }
}