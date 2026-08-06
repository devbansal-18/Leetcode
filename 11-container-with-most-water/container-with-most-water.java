class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j) {
            int maxarea=Math.min(height[i],height[j])*(j-i);
            if(maxarea>ans) {
                ans=maxarea;
            }
            if(height[i]<height[j]) i++;
            else j--;      
        }
        return ans;
    }
}