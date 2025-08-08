class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i = 0; i < mat.length; i++){
            sum+=mat[i][i];
        }
        for(int j = 0; j < mat.length; j++){
            sum+=mat[j][mat.length-1-j];
        }
        if(mat.length%2!=0){
            sum-=mat[mat[0].length/2][mat[0].length/2];
        }
        return sum;
    }
}