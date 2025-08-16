class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String rev = "";
        for(int i = 0; i < words.length; i++){
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            stringBuilder.reverse();
            if(i+1 == words.length){
                rev+=stringBuilder;
            }
            else{
            rev=rev+stringBuilder+" ";
            }
        }
        return rev;
    }
}