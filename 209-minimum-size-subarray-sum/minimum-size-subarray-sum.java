class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int l = 0 , r = 0;
       int minlen = 100001, sum = 0;
       for( ; r<nums.length ;r++){
        sum+=nums[r];
        while(sum>=target){
            minlen = Math.min(minlen, r-l+1);
            sum-=nums[l];
            l++;
        }
       }
       return minlen==100001?0:minlen;
    }
}