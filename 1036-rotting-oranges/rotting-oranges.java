class Solution {
    public int orangesRotting(int[][] grid) {
         int minute = 0;
        // for(int i = 0 ; i < grid.length ; i++){
        //     for(int j = 0 ; j < grid[0].length ; j++){
        //         if(grid[i][j] != 0){
        //             if(grid[i][j] == 2){
        //                 int edit = 0;
        //                 int f1 = 0,f2 =0,f3 = 0, f4 = 0;
        //                 if((i+1 < grid.length) && grid[i+1][j]  == 1){
        //                     f1=1;
        //                     edit = 1;
        //                 }
        //                 if( (j+1 < grid[0].length) && grid[i][j+1] == 1){
        //                     f2 = 1;
        //                     edit = 1;
        //                 }
        //                 if((i-1 >=0 ) && grid[i-1][j] == 1){
        //                     f3 =1;
        //                     edit = 1;
        //                 }
        //                 if((j-1 >= 0 ) && grid[i][j-1] == 1){
        //                     f4 =1;
        //                     edit = 1;
        //                 }
        //                 if(f1 == 1){
        //                     grid[i+1][j] = 2;
        //                 }
        //                 if(f2 == 1){
        //                     grid[i][j+1] = 2;
        //                 }
        //                 if(f3 == 1){
        //                     grid[i-1][j] = 2;
        //                 }
        //                 if(f4 ==1){
        //                     grid[i][j-1] = 2;
        //                 }
        //                 if(edit == 1)
        //                 {
        //                 minute++;
        //                 }
        //             }
        //         }
        //     }
        // }
        // for(int i = 0 ; i < grid.length ; i++){
        //     for(int j = 0 ; j <grid[0].length ; j++){
        //         if(grid[i][j] == 1){
        //             return -1;
        //         }
        //     }
        // }
        // return minute;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        //queue.add(), queue.poll()

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j <grid[0].length ; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        
        while(!queue.isEmpty() && fresh > 0){
            int size = queue.size();
            while(size-- > 0){
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            if(i+1 <grid.length && grid[i+1][j] == 1){
                grid[i+1][j] = 2;
                queue.add(new int[]{i+1 , j});
                fresh--;
            }
            
            if(j+1 <grid[0].length && grid[i][j+1] == 1){
                grid[i][j+1] = 2;
                queue.add(new int[]{i , j+1});
                fresh--;
            }
            if(i-1 >= 0 && grid[i-1][j] == 1){
                grid[i-1][j] = 2;
                queue.add(new int[]{i-1 , j});
                fresh--;
            }
            if(j-1 >= 0 && grid[i][j-1] == 1){
                grid[i][j-1] = 2;
                queue.add(new int[]{i , j-1});
                fresh--;
            }
        }
        minute++;
        }
        return fresh == 0?minute:-1;
    }
}