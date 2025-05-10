class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        int val=1;
        while(val==1){
            if(hs.contains(original)){
                original*=2;
            }
            else{
                val=0;
            }
        }
        return original;
    }
}