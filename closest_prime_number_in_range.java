import java.util.*;
class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        ArrayList<Integer> prime=new ArrayList<>();
        for(int ptr=left;ptr<=right;ptr++){
            if(isPrime(ptr)){
                prime.add(ptr);
            }
        }
        if(prime.size()<=1){
            return ans;
        }
        int min=Integer.MAX_VALUE;
        for(int index=1;index<prime.size();index++){
            int diff=prime.get(index)-prime.get(index-1);
            if(diff<min){
                min=diff;
                ans[0]=prime.get(index-1);
                ans[1]=prime.get(index);
            }
        }
        return ans;
    }
}
