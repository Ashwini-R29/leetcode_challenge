import java.util.*;
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wcount=0;
        int len=blocks.length();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=len-k;i++){
            wcount=0;
        for(int j=i;j<i+k;j++){
            if(blocks.charAt(j)=='W') wcount++;
           }
           min=Math.min(min,wcount);
        }
        return min;
    }
}
