class Solution {
    public int maxProduct(int[] nums) {
        // int n=nums.length;
        // int maxprod=-10;
        // for(int i=0;i<n;i++) {
        //     int prod=1;
        //     for(int j=i;j<n;j++) {
        // prod*=nums[j];
        // maxprod=Math.max(prod,maxprod);
        //     }
        // }
        // return maxprod; 
      int n=nums.length;
      int maxprod=Integer.MIN_VALUE;
      int pref=1;
      int suff=1;
      for(int i=0;i<n;i++) {
        if(pref==0) pref=1;
        if(suff==0) suff=1;
        pref*=nums[i];
        suff*=nums[n-1-i];
        maxprod=Math.max(maxprod,Math.max(pref,suff));
      }
      return maxprod;
    }
}