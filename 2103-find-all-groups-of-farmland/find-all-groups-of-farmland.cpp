class Solution {
public:
    int mr  , mc ;
void dfs(vector<vector<int>>& land , int r , int c){
    if(r < 0 || c < 0 || r >= land.size() || c >= land[0].size()){
        return;
    }
    
    if(land[r][c] == 1){
        
        land[r][c] = 0;
        if(mr < r){
            mr = r;
        }
        if(mc < c){
            mc = c;
        }
        dfs(land,r,c+1);
        dfs(land,r+1,c);
        dfs(land,r,c-1);
        dfs(land,r-1,c);
    }
}
    vector<vector<int>> findFarmland(vector<vector<int>>& land) {
        vector<vector<int>> res;
        for(int i = 0 ; i < land.size(); i++){
            for(int j = 0 ; j< land[0].size();j++){
                if(land[i][j]==1){
                    mr = i ;
                    mc = j ; 
                    dfs(land , i, j);
                    vector<int> curr = {i,j,mr,mc};
                    res.push_back(curr);
                }
            }
        }
        return res;

    }
};