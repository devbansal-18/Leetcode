class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int st=0;
        int end=nums.length-1;
        int ans=-1;
        while(st<=end) {
            int mid=st+(end-st)/2;
            if(nums[mid]>nums[n-1]) st=mid+1;
            else{
           ans=nums[mid];
             end=mid-1;
            }
        }
        return ans;
    }
}