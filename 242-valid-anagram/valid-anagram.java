class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character , Integer> smap= new HashMap<>();
        for(char c:s.toCharArray()){
            smap.put(c,smap.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!smap.containsKey(c)){
                return false;
            }
            if(smap.get(c)==0){
                return false;
            }
            smap.put(c,smap.get(c)-1);
        }
        return true;
    }
}