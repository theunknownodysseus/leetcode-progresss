class Solution {
public:

    long long area = 0 ;
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

    int countIslands(vector<vector<int>>& grid , int k) {
        int count = 0;
        for(int r = 0 ; r < grid.size() ; r++){
            for(int c = 0 ; c < grid[0].size() ; c++){
                if(grid[r][c] != 0){
                    dfs(grid,r,c);
                    if(area%k == 0 ){
                        count++;
                    }
                    area = 0;
                }
            }
        }
        return count;
    }
};