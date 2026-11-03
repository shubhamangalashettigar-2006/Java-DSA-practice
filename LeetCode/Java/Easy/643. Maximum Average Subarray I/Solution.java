class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int cursum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            cursum+=nums[i];
        }
        maxsum=cursum;
        for(int i=k;i<nums.length;i++){
            cursum=cursum-nums[i-k]+nums[i];
            maxsum=Math.max(maxsum,cursum);
        }
        return (double)maxsum/k;
    }
}