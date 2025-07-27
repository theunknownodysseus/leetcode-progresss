class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude= new int[gain.length+1];
        int max=0;
        altitude[0]=0;
        for(int i = 1 ;i<=gain.length;i++){
            altitude[i]=altitude[i-1]+gain[i-1];
            if(altitude[i]>max){
                max=altitude[i];
            }
        }
        return max;
    }
}