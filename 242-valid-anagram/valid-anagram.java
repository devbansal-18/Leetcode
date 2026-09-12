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
        for(int i=0;i<t.length();i++) {
            char ch=t.charAt(i);
            if(!mp1.containsKey(ch)) return false;
            else {
                mp1.put(ch,mp1.get(ch)-1);
            }
        }
        for(int i:mp1.values()) {
            if(i!=0) return false;
        }
        return true;
    }
}