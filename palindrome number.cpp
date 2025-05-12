class Solution {
public:
    bool isPalindrome(int x) {
        long t=x;
        long s=0;
        if(t<0){
            t=t*(-1);
        }
        while(t>0){
            long r=t%10;
            s=s*10+r;
            t=t/10;
        }
        if(x==s){
            return true;
        }
        else if(t<0){
            return false;
        }
        else{
            return false;
        }
    }
};