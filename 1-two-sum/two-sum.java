class Solution {
    public int[] twoSum(int[] arr, int target) {
    int[] ans={};
    int n=arr.length;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            if(arr[j]==target-arr[i]) {
                ans=new int[]{i,j};
                return ans;
            }
        }
    }
    return ans;
    }
}