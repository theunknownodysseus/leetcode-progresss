class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        back(nums, res, new ArrayList<>());
        return res;
    }
    public void back(int[] nums , List<List<Integer>> res , List<Integer> curr){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
        }
        else{
            for(int i = 0 ; i < nums.length ; i++){
                if(!curr.contains(nums[i])){
                    curr.add(nums[i]);
                    back(nums, res , curr);
                    curr.remove(curr.size()-1);
                }
            }
        }
    }
}