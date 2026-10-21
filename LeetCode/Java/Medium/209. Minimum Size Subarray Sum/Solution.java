class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int minlength=Integer.MAX_VALUE;
        int sum=0;
        while(right<nums.length || sum>=target){
            if(sum<target){
                sum+=nums[right];
                right++;
            }
            else{
                minlength=Math.min(minlength,right-left);
                sum-=nums[left];
                left++;
            }
        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
    }
}