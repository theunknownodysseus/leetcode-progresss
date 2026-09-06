class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0 ; i < nums.length; i++){
            int minind  = i;
            for(int j = i + 1 ; j< nums.length ; j++){
                if(nums[minind] > nums[j]){
                    minind = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minind];
            nums[minind] = temp;
        }
    }
}