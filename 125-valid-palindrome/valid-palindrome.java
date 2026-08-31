class Solution {
    public boolean isalphanum(char ch) {
        return (ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9');
    }
    public boolean isPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=s.length()-1;
      while(i<j) {
        char l=s.charAt(i);
        char r=s.charAt(j);
        if(!isalphanum(l)) {
            i++;
        }
        else if(!isalphanum(r)) {
            j--;
        }
        else {
            if(Character.toLowerCase(l)!=Character.toLowerCase(r)) return false;
            i++;
            j--;
        }
       }
       return true;
    }
}