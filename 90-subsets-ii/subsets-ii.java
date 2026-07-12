class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        back(nums , res, 0 , new ArrayList<>());
        return res;
    }
    public void back(int[] nums, List<List<Integer>> res , int start, List<Integer> curr){
        if(!res.contains(curr))
        res.add(new ArrayList<>(curr));
        for(int i = start; i < nums.length ; i++){
            if(i>start && nums[i] == nums[i-1]){
                continue;
            }
            else{
                curr.add(nums[i]);
                back(nums, res, i+1, curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}