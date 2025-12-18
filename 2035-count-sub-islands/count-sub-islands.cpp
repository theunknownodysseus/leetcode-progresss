class Solution {
public:
int flag = 1;
    void dfs(vector<vector<int>> &grid2, vector<vector<int>>& grid1 , int r , int c ){
        if(r<0 || c<0 || r>=grid2.size() || c>=grid2[0].size()){
            return;
        }
        if(grid2[r][c] == 1){
            if(grid2[r][c]!=grid1[r][c]){
                flag=0;
            }
            grid2[r][c] = 0;
            dfs(grid2,grid1,r,c+1);
            dfs(grid2,grid1,r+1,c);
            dfs(grid2,grid1,r,c-1);
            dfs(grid2,grid1,r-1,c);
        }
    }

    int countSubIslands(vector<vector<int>>& grid1, vector<vector<int>>& grid2) {
        int count = 0;
        for(int r = 0 ; r < grid2.size() ; r++){
            for(int c = 0 ; c < grid2[0].size() ; c++){
                if(grid2[r][c] == 1){
                    dfs(grid2,grid1,r,c);
                    count+=flag;
                    flag = 1;
                }
            }
        }
        return count;
    }
};