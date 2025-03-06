import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid.length;
        int sum=0;
        HashSet<Integer> hs=new HashSet<Integer>();
        int[] ans=new int[2]; 
        for(int index=0;index<grid.length;index++){
            for(int index1=0;index1<grid.length;index1++){
                    sum=sum+grid[index][index1];
                    if(hs.contains(grid[index][index1])){
                        ans[0]=grid[index][index1];
                    }
                    hs.add(grid[index][index1]); 
            }
        }
        sum=sum-ans[0];
        int total=0;
        for(int i=1;i<=len*len;i++){
            total+=i;
        }
        ans[1]=total-sum;
        return ans;
    }
}