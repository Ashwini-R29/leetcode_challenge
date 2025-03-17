import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hs= new HashMap<>();
        int ans=0;
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        for(int i=s.length()-1;i>=0;i--){
            if(i>0){
           if(s.charAt(i)=='V'&&s.charAt(i-1)=='I'){
            ans=ans+4;
            i--;
           }
           else if(s.charAt(i)=='X'&&s.charAt(i-1)=='I'){
            ans=ans+9;
            i=i-1;
           }
           else if(s.charAt(i)=='L'&& s.charAt(i-1)=='X'){
            ans=ans+40;
            i--;
           }
           else if(s.charAt(i)=='C'&&s.charAt(i-1)=='X'){
            ans=ans+90;
            i--;
           }
           else if(s.charAt(i)=='D'&&s.charAt(i-1)=='C'){
            ans=ans+400;
            i--;
           }
           else if(s.charAt(i)=='M'&&s.charAt(i-1)=='C'){
            ans=ans+900;
            i--;
           }
           else if(hs.containsKey(s.charAt(i))){
              ans=ans+hs.get(s.charAt(i));
           }
        }else{
            ans+=hs.get(s.charAt(i));
        }
        }
        return ans;
    }
}
