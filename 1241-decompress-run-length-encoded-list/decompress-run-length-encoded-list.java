class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] result = new int[size];

        for (int i = 0, j= 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            Arrays.fill(result, j, j + freq, val);
            j += freq;
        }

        return result;
    }
}