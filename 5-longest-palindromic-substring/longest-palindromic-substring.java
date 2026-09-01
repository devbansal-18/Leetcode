class Solution {
    public boolean ispall(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==1) return s;
        String ans="";
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)  {
            int len=1;
            for(int j=i+1;j<=n;j++){
           if(ispall(s.substring(i,j))) {
            len=j-i+1;
            if(len>maxlen) {
                 maxlen=Math.max(maxlen,len);
                 ans=s.substring(i,j);
            }
           }
            }
        }
        return ans;
    }
}