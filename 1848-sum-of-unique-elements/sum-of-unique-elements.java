class Solution {
    public int sumOfUnique(int[] nums) {
        int[] num= new int[101];
        int sum=0;
        for(int i:nums){
            num[i]++;
        }
        for(int i=0;i<=100;i++){
            if(num[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}