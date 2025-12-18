class Solution {
public:

    int dfarea = 0; 
    void dfs(vector<vector<int>> &grid , int r , int c ){
        if( r < 0 || c < 0 || r >= grid.size() || c >= grid[0].size() ){
            return;
        }
        if(grid[r][c] == 1){
            grid[r][c] = 0;
            dfarea++;
            dfs(grid,r,c+1);
            dfs(grid,r+1,c);
            dfs(grid,r,c-1);
            dfs(grid,r-1,c);
        }
    }

    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int area = 0;
        for(int r = 0 ; r < grid.size() ; r++){
            for(int c = 0 ; c < grid[0].size() ; c++){
                if(grid[r][c] == 1){
                    dfs(grid,r,c);
                    if(area<dfarea){
                        area = dfarea;
                    }
                    dfarea=0;
                }
            }
        }
        return area;
    }

};