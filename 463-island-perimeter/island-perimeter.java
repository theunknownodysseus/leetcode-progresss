    class Solution {
        public int islandPerimeter(int[][] grid) {
            int peri=0,p=0;
            int n =grid.length;
            int m = grid[0].length;
            for(int i = 0 ; i<n; i++){
                for(int j =0 ; j<m; j++){
                    if(grid[i][j]==1){
                        peri+=4;
                        if(i>0 && grid[i-1][j]==1){
                            p+=2;
                        }
                        if(j>0 && grid[i][j-1]==1){
                            p+=2;
                        }

                    }
                }
            }
            return peri-p;
        }
    }