class Solution {
    public List<String> combinations(String digits, Map<Integer, List<String>> map, int start){
        if(start == digits.length()-1){
            return map.get(digits.charAt(start)-'0');
        }
        List<String> curr = map.get(digits.charAt(start)-'0');
        List<String> res = new ArrayList<>();
        List<String> comns = combinations(digits, map, start+1);
        for(int i = 0 ; i < curr.size() ; i++){
            String currstr = curr.get(i);
            for(String j : comns){
                res.add(currstr+j);
            }
        }
        return res;
        
    }
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(2, Arrays.asList("a", "b", "c"));
        map.put(3, Arrays.asList("d", "e", "f"));
        map.put(4, Arrays.asList("g", "h", "i"));
        map.put(5, Arrays.asList("j", "k", "l"));
        map.put(6, Arrays.asList("m", "n", "o"));
        map.put(7, Arrays.asList("p", "q", "r", "s"));
        map.put(8, Arrays.asList("t", "u", "v"));
        map.put(9, Arrays.asList("w", "x", "y", "z"));

        List<String> res  = combinations(digits,map,0);
        return res;
    }
}