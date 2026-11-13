class Solution {
    public int longestOnes(int[] nums, int k) {
        int numberofZeros=0;
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                numberofZeros++;
            }
            while(numberofZeros>k){
                if(nums[left]==0){
                    numberofZeros--;
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}