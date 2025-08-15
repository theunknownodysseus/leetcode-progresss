class Solution {
    public int findFinalValue(int[] nums, int original){
        while(check(nums, original)){
            original*=2;
        }
        return original;
    }
    public boolean check(int[] arr,int toCheckValue){
        for (int element : arr) 
    if (element == toCheckValue) {
        return true;
    }
    return false;
    }
}