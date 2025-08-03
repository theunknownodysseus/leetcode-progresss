class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        int i = 0;
        for(char a : s.toCharArray()){
            result[indices[i++]]=a;
        }
        return new String(result);
    }
}