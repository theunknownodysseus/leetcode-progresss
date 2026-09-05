class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int mincost1 = cost[0];
        int mincost2 = cost[1];

        for(int i = 2 ; i < cost.length ; i++)
        {
            int curr = Math.min(mincost1, mincost2) + cost[i];
            mincost1 = mincost2;
            mincost2 = curr;
        }

        return Math.min(mincost1,mincost2);
    }
}