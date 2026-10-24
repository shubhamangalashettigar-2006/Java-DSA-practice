class Solution {
    public int[] transformArray(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                cnt++;
            }
        }    
        for(int i=0;i<nums.length;i++){
            if(i<cnt){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        return nums;
    }
}