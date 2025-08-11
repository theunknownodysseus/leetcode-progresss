class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod= 1000000007;
        int[] powers=new int[50];
        int bits = 0 , i = 0;
        while(n!=0){
            if((n&1)==1){
                powers[i++]=1<<bits;
            }
            bits++;
            n=n>>1;
        }
        
        int[] result = new int[queries.length];
        for ( i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            long product = 1;
            for (int j = l; j <= r; j++) {
                product*=powers[j];
                product%=mod;
            }
            result[i] = (int) product;
        }
        return result;
        }
}