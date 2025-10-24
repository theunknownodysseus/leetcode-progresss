class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 1;
        for(int i = 0; i<nums.length; i++){
            arr[i]=l;
            l*=nums[i];
        }
        l=1;
        for(int i = nums.length-1; i>=0; i--){
            arr[i]*=l;
            l*=nums[i];
        }
        return arr;
    }
}