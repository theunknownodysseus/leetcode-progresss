class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        char[] str = s.toCharArray();
        int sum = 0;
        for(int i = 0; i<str.length ; i++){
            if(i < str.length-1 && map.get(str[i]) < map.get(str[i+1])){
                sum+=(map.get(str[i+1]) - map.get(str[i]));
                i++;
            }
            
            else{
                sum+=map.get(str[i]);
            }
        }
        return sum;
    }
}