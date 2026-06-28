class Solution {
    int tochange = 1;
    int canchange = 1;
    public void fix(int i){
        tochange = i;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (canchange == 1) {
            fix(image[sr][sc]);
             canchange--;
            }
        if(image[sr][sc] == tochange && tochange != color) { 
        
        image[sr][sc] = color;
        
        if(sr-1>=0) image = floodFill(image, sr-1, sc ,color);
        if(sc-1>=0) image = floodFill(image, sr, sc-1 ,color);
        if(sr+1<image.length) image = floodFill(image, sr+1, sc ,color);
        if(sc+1<image[0].length) image = floodFill(image, sr, sc+1 ,color);

        }
        return image;
    }
}