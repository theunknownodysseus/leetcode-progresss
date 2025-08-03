class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0,j=0 ; 2*i<nums.length ; i++){
            int freq = nums[2*i];
            int val= nums[2*i+1];
            while(freq!=0){
                result.add(val);
                freq--;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}