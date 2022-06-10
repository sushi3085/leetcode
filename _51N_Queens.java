import java.util.List;
import java.util.ArrayList;

public class _51N_Queens {
    public static void main(String[] args) {
        var solution = new Solution();
        for(int i=1; i<9; i++){
            solution.solveNQueens(i);
        }
    }
}

class Solution {
    public List<boolean[][]> solveNQueens(int n) {
        this.n = n;
        answer = new ArrayList<>();
        
        board = new boolean[n][n];

        count = 0;
        helper(0);
        
        return answer;
    }

    List<boolean[][]> answer;
    private boolean[][] board;
    private int n;

    private int count;
    
    private void helper(int position){
        if(position<0 || position>=n*n) return;
        if(existRow(position)) return;
        if(existCol(position)) return;
        if(count==n){
            answer.add(board.clone());
        }
        // wasd
        board[position/n][position%n] = true;

        helper(position-1);
        helper(position-n);
        helper(position+1);
        helper(position+n);

        board[position/n][position%n] = false;
    }

    private boolean existCol(int position) {
        for(int i=0; i<n; i++){
            if(board[i][i%n]) return true;
        }
        return false;
    }

    private boolean existRow(int position) {
        for(int i=0; i<n; i++){
            if(board[position/n][i]) return true;
        }
        return false;
    }
}
