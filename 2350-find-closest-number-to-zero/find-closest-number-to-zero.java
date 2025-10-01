class Solution {
    public int findClosestNumber(int[] nums) {
        int max =Math.abs(nums[0]), val=nums[0];
        for(int i = 0 ; i<nums.length ; i++){
            if(Math.abs(nums[i])<max){
                max=Math.abs(nums[i]);
                val=nums[i];
            }
        }
        if(val<0){
            for(int i = 0 ; i<nums.length ; i++){
                if(Math.abs(val) == nums[i]){
                    return nums[i];
                }
            }
        }
        return val;
    }
}