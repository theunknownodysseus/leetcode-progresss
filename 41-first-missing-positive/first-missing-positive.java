class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=1;
        for(int i = 0 ;i<nums.length;i++){
            if(min==nums[i]){
                min++;
            }
        }
        return min;
    }
}