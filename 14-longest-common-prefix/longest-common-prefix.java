class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        int mincom = 500;
        for(int i = 0 ; i<strs.length ; i++){
            if(i+1 < strs.length){
            int com = check(strs[i],strs[i+1]);
            mincom = Math.min(com , mincom);
            }
        }
        if(mincom == 500){
            mincom = 0;
        }
        return strs[0].substring(0,mincom);
    }
    int check(String a , String b){
        int i;
        for( i = 0; i < Math.min(a.length(),b.length()); i++){
            if(a.charAt(i) != b.charAt(i)){
                return i;
            }
        }
        return i;
    }
}