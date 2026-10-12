class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');
        }
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diagonals = new HashSet<>();
        Set<Integer> antiDiagonals = new HashSet<>();
        solve(0,board,ans,n,cols,diagonals,antiDiagonals);
        return ans;
    }
    private void solve(int row,char[][]board,List<List<String>> ans, int n, Set<Integer> cols, Set<Integer> diagonals, Set<Integer> antiDiagonals ){
        if(row == n){
            List<String> result = new ArrayList<>();
            for(int i=0; i<n; i++){
                result.add(new String(board[i]));
            }
            ans.add(result);
            return;
        }
        for(int col=0; col<n; col++){
           int diagonal = row - col;
           int antiDiagonal = row + col;
           if(cols.contains(col) || diagonals.contains(diagonal) || antiDiagonals.contains(antiDiagonal)){
            continue;
           }
           board[row][col] = 'Q';
           cols.add(col);
           diagonals.add(diagonal);
           antiDiagonals.add(antiDiagonal);

           solve(row + 1,board,ans,n,cols,diagonals,antiDiagonals);
           
           board[row][col] = '.';
            cols.remove(col);
           diagonals.remove(diagonal);
           antiDiagonals.remove(antiDiagonal);
        }
    }
}