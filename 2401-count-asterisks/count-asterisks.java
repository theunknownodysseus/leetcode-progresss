class Solution {
    public int countAsterisks(String s) {
        int c = 0 ;
        int str = 0;
        for(int i = 0 ;i<s.length() ; i++){
            if(s.charAt(i)=='|'){
                c++;
            }
            if(c%2==0 && s.charAt(i)=='*'){
                    str++;
            }
        }
        return str;
    }
}