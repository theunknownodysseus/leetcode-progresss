class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        Map<Character , Integer> map = new HashMap<>();
        for(char a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(map.get(arr[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}