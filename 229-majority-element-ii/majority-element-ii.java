class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int lim = (int)Math.floor(nums.length/3);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) > lim){
                arr.add(i);
            }
        }
        return arr;
    }
}