class Solution {
    public boolean dfshelper(char[][] board , int k , String word , int i , int j){
        if(k == word.length()-1 && word.charAt(k)==board[i][j]){
            return true;
        }
        if(k == word.length()-1 && word.charAt(k)!=board[i][j]){
            return false;
        }
        // if(k >= word.length()){
        //     return false;
        // }
        //left
        if(word.charAt(k) != board[i][j]){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';

        boolean flag = false;
        if(j-1>=0){
            flag = flag || dfshelper(board , k+1, word, i,j-1);
        }
        if(j+1<=board[0].length-1){
            flag = flag || dfshelper(board , k+1, word, i,j+1);
        }
        if(i-1 >= 0){
            flag = flag || dfshelper(board , k+1, word, i-1,j);
        }
        if(i+1 <= board.length-1){
            flag = flag || dfshelper(board , k+1, word, i+1,j);
        }
        board[i][j] = temp;
        return flag;
    }
    public boolean exist(char[][] board, String word) {
        int k = 0;
        boolean flag = false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(k)){
                    flag = dfshelper(board , k , word , i , j);
                    if(flag){
                        return flag;
                    }
                }
            }
        }
        return flag;
    }
}