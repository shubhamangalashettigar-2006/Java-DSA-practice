class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int pivot=Find_pivot(nums,s,e);
        if(pivot==-1){
           return BS(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return BS(nums,target,0,pivot-1);
        }
        return BS(nums,target,pivot+1,nums.length-1);
    }
    int Find_pivot(int[] arr,int s,int e){
        while(s<e){
            int mid=(s+e)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>=arr[s]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    int BS(int[] arr,int t, int s, int e){
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}