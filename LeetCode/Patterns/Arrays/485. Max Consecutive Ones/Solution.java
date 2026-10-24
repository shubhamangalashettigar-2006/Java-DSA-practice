class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int crnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                crnt++;
            }
            else{
                crnt=0;
            }
            maxOnes=Math.max(maxOnes,crnt);
        }
        return maxOnes;
    }
}