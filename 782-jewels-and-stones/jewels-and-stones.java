class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int sum=0;
        for(char i:stones.toCharArray()){
        for(char j:jewels.toCharArray()){
            if(i==j){
                sum++;
            }
        }
        }
        return sum;
    }
}