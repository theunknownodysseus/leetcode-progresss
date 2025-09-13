class Solution {
    public int maxFreqSum(String s) {
        int vowelfreq = 0 , constfreq = 0;
        Map<Character, Integer> map= new HashMap<>();
        for(char a : s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Character> arr = Arrays.asList('a','i','e','o','u');
        for(char a : s.toCharArray()){
            if(arr.contains(a) && vowelfreq<map.get(a)){
                vowelfreq=map.get(a);
                continue;
            }
            if(!arr.contains(a) && constfreq<map.get(a)){
                constfreq=map.get(a);
            }
        }
        return vowelfreq + constfreq;
    }
}