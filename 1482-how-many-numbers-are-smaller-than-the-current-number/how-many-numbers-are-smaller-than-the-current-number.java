class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int ind=0;
        for(int i : nums){
            int sum=0;
            for(int j : nums){
                if(i>j){
                    sum++;
                }
            }
            result[ind++]=sum;
        }
        return result;
    }
}