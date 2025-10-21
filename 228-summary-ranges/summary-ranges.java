class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int start = nums[i];
            while (i<nums.length-1 && nums[i]+1 == nums[i+1]){
                i++;
            }
            if(start==nums[i]){
                ans.add(Integer.toString(nums[i]));
            }
            else{
                ans.add(Integer.toString(start)+"->"+Integer.toString(nums[i]));
            }
        }
        return ans;
    }
}