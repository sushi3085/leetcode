public class _304RangeSumQuery2D_Immutable {
    public static void main(String[] args) {
        var answer = new NumMatrix(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}});
        int result = answer.sumRegion(1, 1, 3, 3);
        System.out.println(result);
    }
}

class NumMatrix{
    private int[][] mat;

    public NumMatrix(int[][] matrix) {
        mat = new int[matrix.length+1][matrix[0].length+1];
        for(int i=0; i<matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                mat[i+1][j+1] = matrix[i][j];
            }
        }
        for(int i=1; i<mat.length; i++){
            for(int j=1; j<mat[0].length; j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int i=1; i<mat.length; i++){
            for(int j=1; j<mat[0].length; j++){
                mat[j][i]+=mat[j-1][i];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return mat[row2][col2]+mat[row1-1][col1-1]-mat[row1-1][col2]-mat[row2][col1-1];
    }
}
