class Solution {
    public int countAsterisks(String s) {
        int c = 0 ;
        int str = 0;
        char[] arr = s.toCharArray();
        for(int i = 0 ;i<s.length() ; i++){
            if(arr[i]=='|'){
                c++;
            }
            if(c%2==0 && arr[i]=='*'){
                    str++;
            }
        }
        return str;
    }
}