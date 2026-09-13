class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++) {
        if(!mp.containsKey(nums[i])) {
            mp.put(nums[i],1);
        }
        else {
            mp.put(nums[i],mp.get(nums[i])+1);
        }
        }
        int ans=Integer.MIN_VALUE;
        for(var e:mp.keySet()) {
            if(mp.get(e)>Math.floor(n/2)) {
                ans=Math.max(ans,e);
            }
        }
        return ans;
    }
}