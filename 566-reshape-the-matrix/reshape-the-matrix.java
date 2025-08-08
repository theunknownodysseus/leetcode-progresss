class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(c==mat[0].length && r==mat.length){
            return mat;
        }
        if(mat[0].length*mat.length != r*c){
            return mat;
        }
        int[][] result=new int[r][c];
        int p = 0, q, i;
        int[] oned = new int[r*c];
        for(i = 0; i<mat.length ;i++){
            for(int j = 0; j< mat[0].length ;j++){
                oned[p++] = mat[i][j];
            }
        }
        i = 0;
        for(p = 0; p<r; p++){
            for(q = 0; q<c; q++){
                result[p][q]=oned[i++];
            }
        }
        return result;
    }
}