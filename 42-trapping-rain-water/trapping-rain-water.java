class Solution {
    public int trap(int[] height) {
        int water = 0;
        int right = height.length-1;
        int left = 0;
        int leftmax= -1, rightmax = -1;
        while(left<right){
            if(height[left] < height[right]){
                if(height[left]>leftmax){
                    leftmax  = height[left];
                }
                else{
                    water+=(leftmax-height[left]);
                }
                left++;
            }
            else{
                if(height[right]>rightmax){
                    rightmax  = height[right];
                }
                else{
                    water+=(rightmax-height[right]);
                }
                right--;
            }
        }
        return water;
    }
}