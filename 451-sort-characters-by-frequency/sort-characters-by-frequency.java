class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        String res="";
        while(res.length() != s.length()){
char ch = freq.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
            res+=String.valueOf(ch).repeat(freq.get(ch));
            freq.remove(ch);
        }
        return res;
    }
}