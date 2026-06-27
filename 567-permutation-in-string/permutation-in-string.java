class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0 , r = s1.length()-1;
        if(s1.length() > s2.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i =0; i<s1.length() ; i++){
            freq[s1.charAt(i)-'a']++;
        }
        int winfreq[] = new int[26];
        for(l = 0 ; r<s2.length(); l++,r++){
            for(int i = l; i<=r ; i++)
            {
             winfreq[s2.charAt(i)-'a']++;
            }
            int flag = 1;
            for(int i = 0 ; i< 26 ;i++){
                if(freq[i] != winfreq[i]){
                    flag = 0;
                }
            }
            if(flag == 1){
                return true;
            }
            else{
                Arrays.fill(winfreq, 0);
            }
            
        }
        return false;
    }
}