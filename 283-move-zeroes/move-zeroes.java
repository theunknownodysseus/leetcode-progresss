class Solution {
    public void moveZeroes(int[] nums) {
        
        int count = 0;
        for(int i : nums){

            if(i==0){ 
            count++;
            }

        }

        int ind = 0;
        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i]!=0){
                nums[ind] = nums[i];
                ind++;
            }

        }

        count = nums.length - count;
        for(int i  = count ; i<nums.length ; i++){
            nums[i] = 0;
        }
    }
}