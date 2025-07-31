//brute force

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ;i<matrix.length;i++){
            int ind1=i;
            int ind2=0;
            for(int j = 0 ; j <matrix[i].length;j++){
                if(matrix[i][j] <matrix[ind1][ind2]){
                    ind1=i;
                    ind2=j;
                }
            }
            int max = matrix[0][ind2];
            for(int k = 1 ; k<matrix.length ; k++ ){
                if(matrix[k][ind2]>max){
                    max = matrix[k][ind2];
                }
            }
            if(max == matrix[ind1][ind2]){
                result.add(max);
            }
        }
        return result;
        }
    }

// 3 00     7 01      8 02 
// 9  10    11 11    13  12
// 15  20   16  21    17 22