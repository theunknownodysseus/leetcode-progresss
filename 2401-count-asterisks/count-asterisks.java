class Solution {
    public int countAsterisks(String s) {
        boolean toggle = false;
        int c = 0 ;
        char[] arr = s.toCharArray();
        for(int i = 0 ; i< s.length(); i++){
            if(arr[i]=='|'){
                toggle = !toggle;
            }
            if(arr[i]=='*' && !toggle){
                c++;
            }
        }
        return c;
    }
}