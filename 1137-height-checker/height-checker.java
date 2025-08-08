class Solution {
    public int heightChecker(int[] heights) {
        int[] og = new int[heights.length];
        int sum=0;
        for(int c:heights){
            og[sum++]=c;
        }
        Arrays.sort(heights);
        sum=0;        
        for(int i =0;i<heights.length;i++){
            if(og[i]!=heights[i]){
                sum++;
            }
        }
        return sum;
    }
}