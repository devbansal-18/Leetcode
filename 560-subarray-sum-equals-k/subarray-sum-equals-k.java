class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
      int n=nums.length;
      int count=0;
      int prefsum=0;
      mp.put(0,1);
     for(int i=0;i<n;i++) {
      prefsum+=nums[i];
      int target=prefsum-k;
      if(mp.containsKey(target)) {
        count+=mp.get(target);
      }
      mp.put(prefsum,mp.getOrDefault(prefsum,0)+1);
     }
      return count;
    }
}