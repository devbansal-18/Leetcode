class Solution {
    public void sortColors(int[] nums) {
    //    int zeroes=0;
    //    int ones=0;
    //    int twos=0;
    //    for(int i=0;i<nums.length;i++) {
    //     if(nums[i]==0) zeroes++;
    //     else if(nums[i]==1) ones++;
    //     else twos++;
    //    }
    //    int i=0;
    //    while(zeroes>0) {
    //     nums[i]=0;
    //     i++;
    //     zeroes--;
    //    }
    //    while(ones>0) {
    //     nums[i]=1;
    //     i++;
    //     ones--;
    //    }
    //    while(twos>0) {
    //     nums[i]=2;
    //     i++;
    //     twos--;
    //    }
    int low=0;
    int mid=0;
    int high=nums.length-1;
    while(mid<=high) {
        if(nums[mid]==0) {
            int temp=nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;
            low++;
            mid++;
        } 
        else if(nums[mid]==1) mid++;
        else {
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
        }
    }
    }
}