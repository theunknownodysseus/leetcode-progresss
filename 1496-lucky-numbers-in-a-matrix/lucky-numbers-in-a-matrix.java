class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) { 
        List<Integer> result = new ArrayList<>();
        int minind1,minind2;
        for(int i = 0 ; i<matrix.length ; i++){
            minind1= i;
            minind2= 0;
            for(int j = 0 ; j<matrix[i].length; j++){
                if(matrix[i][j]<matrix[minind1][minind2]){
                    minind1=i;
                    minind2=j;
                }
            }
            int max = matrix[0][minind2];
            for(int k = 1; k< matrix.length ; k++){
                if(matrix[k][minind2] > max){
                    max = matrix[k][minind2];
                }
            }
            if(matrix[minind1][minind2] == max){
                result.add(max);
            }
        }
        return result;
    }
}



// [3,7,8] 0
// [9,11,13] 1
// [15,16,17] 2

