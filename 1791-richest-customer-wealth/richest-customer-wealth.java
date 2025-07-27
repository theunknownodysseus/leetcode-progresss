class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] arr:accounts){
            int sum = 0;
            for(int value:arr){
                sum+=value;
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}