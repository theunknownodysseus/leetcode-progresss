class Solution {
    public String minWindow(String s, String t) {
        int l = 0 , minlen = 100001;
        int need[] = new int[128];
        for(char i : t.toCharArray()){
            need[i]++;
        }
        int count = t.length();
        int start= 0;
        for(int r = 0 ; r<s.length() ; r++){
            if(need[s.charAt(r)]>0){
                count--;
            }
            need[s.charAt(r)]--;
            while(count == 0){
                if(r-l+1 < minlen){
                    minlen = r-l+1;
                    start = l;
                }
                need[s.charAt(l)]++;
                if(need[s.charAt(l)] > 0){
                    count++;
                }
                l++;
            }
        }
        return minlen==100001?"":s.substring(start,start+minlen);
    }
}