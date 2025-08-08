class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length, cols = mat[0].length;

        if ((rows == r && cols == c) || rows * cols != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];
        int p = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[p / c][p++ % c] = mat[i][j];
            }
        }
        return result;
    }
}
