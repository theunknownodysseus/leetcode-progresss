class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char arr[] = s.toCharArray();
        for(int i = 0, j = s.length()-1; i < j; i++,j--){
            if(arr[i] != arr[j]){
                return false;
            }
        }
        return true;
    }
}