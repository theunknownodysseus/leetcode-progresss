class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // int[] min = new int[nums.length];
        // int minval = Integer.MAX_VALUE;
        // for(int i = nums.length-1 ; i>= 0 ; i--){
        //     if(nums[i] < minval){
        //         minval = nums[i];
        //         min[i] = nums[i];
        //     }
        //     else{
        //         min[i] = minval;
        //     }
        // }
        // int[] max = new int[nums.length];
        // int maxval = Integer.MIN_VALUE;
        // for(int i = 0 ; i<= nums.length-1 ; i++){
        //     if(nums[i] > maxval){
        //         maxval = nums[i];
        //         max[i] = nums[i];
        //     }
        //     else{
        //         max[i] = maxval;
        //     }
        // }

        // for(int i = 0 ; i < nums.length; i++){
        //     int score = max[i] - min[i];
        //     if(score <= k){
        //         return i;
        //     }
        // }

        // return -1;
        int n = nums.length;
        int right[] = new int[n];
        right[n-1] = nums[n-1];
        for(int i = n-2; i>=0 ; i--){
            right[i] = Math.min(nums[i],right[i+1]);
        }
        int left = 0;
        for(int i = 0 ; i < n ; i++){
            left = Math.max(nums[i], left);
            if(left - right[i] <=k){
                return i;
            }
        }
        return -1;
    }
}