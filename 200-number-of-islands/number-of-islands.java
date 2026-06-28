class Solution {
    public void dfs(char[][] grid,int i , int j){
        if(grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        if (i-1 >= 0) dfs(grid, i-1, j);
        if (j-1 >= 0) dfs(grid, i, j-1);
        if (i+1 < grid.length) dfs(grid, i+1, j);
        if (j+1 < grid[0].length) dfs(grid, i, j+1);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}