class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);

        Set<Integer> onlyIn1 = new HashSet<>(set1);
        Set<Integer> onlyIn2 = new HashSet<>(set2);

        onlyIn1.removeAll(set2);
        onlyIn2.removeAll(set1);

        return Arrays.asList(new ArrayList<>(onlyIn1), new ArrayList<>(onlyIn2));
    }
}
