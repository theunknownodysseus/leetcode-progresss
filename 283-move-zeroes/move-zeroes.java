class Solution {
    public void moveZeroes(int[] nums) {
        
        // int count = 0;
        // for(int i : nums){

        //     if(i==0){ 
        //     count++;
        //     }

        // }

        // int ind = 0;
        // for(int i = 0 ; i < nums.length ; i++){

        //     if(nums[i]!=0){
        //         nums[ind] = nums[i];
        //         ind++;
        //     }

        // }  0,1,0,3,12

        // count = nums.length - count;
        // for(int i  = count ; i<nums.length ; i++){
        //     nums[i] = 0;
        // }

        int i , j;
        i = 0;
        j = 0;
        while(j<nums.length){
            if(nums[j]!=0)
            {   
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(i +" "+ j);
    }
}