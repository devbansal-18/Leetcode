class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
      int curr_count=0;
      int max_ans=0;
      for(int j=0;j<n;j++) {
        if(nums[j]==1) {
            curr_count++;
        }
        else {
            max_ans=Math.max(max_ans,curr_count);
            curr_count=0;
        }
      }
      return Math.max(max_ans,curr_count);
    }
}