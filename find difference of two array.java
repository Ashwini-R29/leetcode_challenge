class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int num : nums1) {
            hs1.add(num);
        }
        for (int num : nums2) {
            hs2.add(num);
        }
        List<Integer> onlyIn1 = new ArrayList<>();
        List<Integer> onlyIn2 = new ArrayList<>();
        for (int num : hs1) {
            if (!hs2.contains(num)) {
                onlyIn1.add(num);
            }
        }
        for (int num : hs2) {
            if (!hs1.contains(num)) {
                onlyIn2.add(num);
            }
        }
        ans.add(onlyIn1);
        ans.add(onlyIn2);
        return ans;
    }
}
