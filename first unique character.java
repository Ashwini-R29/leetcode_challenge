class Solution {
    public int firstUniqChar(String s) {
        int ans=-1;
        HashMap<Character,Integer> map= new HashMap<>();
         for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i=0;i<s.length();i++){
            if((map.get(s.charAt(i)))==1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
