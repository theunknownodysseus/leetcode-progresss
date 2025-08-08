class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr =new int[26];
        for(char c:magazine.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            arr[c-'a']--;
            if(arr[c-'a']==-1){
                return false;
            }
        }
        return true;
    }
}