class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int res=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            while(right-left+1>k){
                left++;
            }
            if(right-left+1==k){
                res=Math.min(nums[right]-nums[left],res);
            }
            
        }
        return res;
    }
}