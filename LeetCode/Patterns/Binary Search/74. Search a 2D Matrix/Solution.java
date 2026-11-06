class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int s=0;
        int e=rows*cols-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int i=mid/cols;
            int j=mid%cols;
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}