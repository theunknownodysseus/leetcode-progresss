class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> ans = new HashMap<>();
        
        for(int i : nums){

            ans.put(i, ans.getOrDefault(i,0)+1);

        }

        for(int i : nums){

            if(ans.get(i) > (nums.length-1)/2){
                return i;
            }

        }

        return nums[0];

    }
}