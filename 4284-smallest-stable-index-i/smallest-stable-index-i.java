class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] min = new int[nums.length];
        int minval = Integer.MAX_VALUE;
        for(int i = nums.length-1 ; i>= 0 ; i--){
            if(nums[i] < minval){
                minval = nums[i];
                min[i] = nums[i];
            }
            else{
                min[i] = minval;
            }
        }
        int[] max = new int[nums.length];
        int maxval = Integer.MIN_VALUE;
        for(int i = 0 ; i<= nums.length-1 ; i++){
            if(nums[i] > maxval){
                maxval = nums[i];
                max[i] = nums[i];
            }
            else{
                max[i] = maxval;
            }
        }

        for(int i = 0 ; i < nums.length; i++){
            int score = max[i] - min[i];
            if(score <= k){
                return i;
            }
        }

        return -1;
    }
}