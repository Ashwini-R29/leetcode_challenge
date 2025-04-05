class Solution {
    public int subsetXORSum(int[] nums) {
        int total=0;
        for(int index=0;index<nums.length;index++){
            total=total|nums[index];
        }
        int half=1<<nums.length-1;
        return half*total;
    }
}
