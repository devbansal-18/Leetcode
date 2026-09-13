class Solution {
    static int kadagne1(int []nums,int n) {
        int sum = nums[0];
       int maxsum = nums[0];
   for(int i = 1; i < nums.length; i++) {
    sum = Math.max(nums[i], sum + nums[i]);
    maxsum = Math.max(maxsum, sum);
}
return maxsum;
    }
  static int kadagne2(int []nums,int n) {
        int sum = nums[0];
        int minsum = nums[0];
   for(int i = 1; i < nums.length; i++) {
    sum = Math.min(nums[i], sum + nums[i]);
    minsum = Math.min(minsum, sum);
}
return minsum;
    }
    public int maxSubarraySumCircular(int[] nums) {
    //     int n=nums.length;
    //     int maxsum=nums[0];
    //     for(int i=0;i<n;i++) {
    //         int sum=0;
    //         for(int j=i;j<n;j++) {
    //             sum+=nums[j];
    //             maxsum=Math.max(sum,maxsum);
    //         }
    //     }
    //    for(int i = 0; i < n; i++) {
    //         int sum = nums[i];
    //         for(int j = (i + 1) % n; j != i; j = (j + 1) % n) {
    //             sum += nums[j];
    //             maxsum = Math.max(maxsum, sum);
    //         }
    //     }
    //     return maxsum;
   int n=nums.length;
   //total sum 
   int sum=0;
   for(int i=0;i<n;i++) {
    sum+=nums[i];
   }
    int minsum=kadagne2(nums,n);
    int maxsum=kadagne1(nums,n);
    int circularsum=sum-minsum;
    if(maxsum>0) return Math.max(maxsum,circularsum);
    return maxsum;
    }
}