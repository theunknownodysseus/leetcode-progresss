class Solution {
    public int[] decompressRLElist(int[] nums) {
        int totalSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            totalSize += nums[i];
        }

        int[] result = new int[totalSize];
        int index = 0;

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            java.util.Arrays.fill(result, index, index + freq, val);
            index += freq;
        }

        return result;
    }
}