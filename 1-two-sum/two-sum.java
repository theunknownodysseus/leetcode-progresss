class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = i+1; j < nums.length ; j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        // }
        // }
        // return new int[] {-1,-1};

        Map <Integer , Integer> map1 = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map1.containsKey(target - nums[i])){
                return new int[]{i, map1.get(target - nums[i])};
            }
            map1.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}