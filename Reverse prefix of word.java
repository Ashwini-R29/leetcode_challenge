class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s=new Stack<>();
        int ind=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ind=i;
                break;
            }
        }
        for(int i=0;i<=ind;i++){
            s.push(word.charAt(i));
        }
        String result = "";
        while (!s.isEmpty()) {
            result += s.pop(); 
        }
        for(int i=ind+1;i<word.length();i++){
            result+=word.charAt(i);
        }
        return result;
    }
}