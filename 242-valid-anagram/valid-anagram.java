class Solution {
    static HashMap<Character,Integer> makefreqmap(String str) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
          if(!mp.containsKey(ch)) {
            mp.put(ch,1);
          }
          else {
            mp.put(ch,mp.get(ch)+1);
          }
        }
         return mp;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
         HashMap<Character,Integer> mp1=makefreqmap(s);
         HashMap<Character,Integer> mp2=makefreqmap(t);
         return mp1.equals(mp2);
    }
}