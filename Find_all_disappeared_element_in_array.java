
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean[] bool=new boolean[1000000];
        List<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(!bool[nums[i]]){
                bool[nums[i]]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!bool[i]){
                res.add(i);
            }
        }
       return res;
    }
}
