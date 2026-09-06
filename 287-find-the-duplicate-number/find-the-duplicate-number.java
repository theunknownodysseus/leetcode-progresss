class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.add(i)){
                continue;
            }
            else{
                return i;
            }
        }
        return 0;
    }
}