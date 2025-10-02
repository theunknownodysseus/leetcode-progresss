class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        char[] res = new char[word1.length()+word2.length()];

        int k = 0;
        for(int i = 0 ; i<(Math.min(arr1.length,arr2.length)); i++)
        {
             res[k++]=arr1[i];
             res[k++]=arr2[i];
        }
        if(arr1.length < arr2.length)
        {
            for(int i = arr1.length; i<arr2.length; i++){
                res[k++] = arr2[i];
            }

        }
        else
        {
            for(int i = arr2.length; i<arr1.length; i++){
                res[k++] = arr1[i];
            }
        }
        return new String(res);
    }
}