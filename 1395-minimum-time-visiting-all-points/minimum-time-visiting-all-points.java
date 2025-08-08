class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x,y, time = 0;
        for(int i = 0;i<points.length-1; i++){
            x=Math.abs(points[i][0]-points[i+1][0]);
            y=Math.abs(points[i][1]-points[i+1][1]);
            time+=(x>y?x:y);
        }
        return time;
    }
}