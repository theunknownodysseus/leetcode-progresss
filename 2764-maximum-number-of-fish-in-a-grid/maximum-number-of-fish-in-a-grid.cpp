class Solution {
public:

    int area = 0;
    void dfs(vector<vector<int>> &grid , int r , int c ){
        if(r<0 || c<0 || r>=grid.size() || c>=grid[0].size()){
            return;
        }
        if(grid[r][c] != 0){
            area+=grid[r][c];
            grid[r][c] = 0;
            dfs(grid,r,c+1);
            dfs(grid,r+1,c);
            dfs(grid,r,c-1);
            dfs(grid,r-1,c);
        }
    }

    int findMaxFish(vector<vector<int>>& grid) {
        int max = 0;
        for(int r = 0 ; r < grid.size() ; r++){
            for(int c = 0 ; c < grid[0].size() ; c++){
                if(grid[r][c] != 0){
                    dfs(grid,r,c);
                    if(max<area){
                        max = area;
                    }
                    area = 0;
                }
            }
        }
        return max;
    }
};