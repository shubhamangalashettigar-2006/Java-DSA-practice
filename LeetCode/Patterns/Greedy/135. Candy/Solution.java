// class Solution {
//     public int candy(int[] ratings) {
//         int n=ratings.length;
//         int[] candies=new int[n];
//         Arrays.fill(candies,1);
//         int total=0;
//         for(int i=1;i<n;i++){
//             if(ratings[i]>ratings[i-1]){
//                 candies[i]=candies[i-1]+1;
//             }
//         }
//         for(int i=n-2;i>=0;i--){
//             if(ratings[i]>ratings[i+1]){
//                 candies[i]=Math.max(candies[i],candies[i+1]+1);
//             }
//         }
//         for(int c:candies){
//             total+=c;
//         }

//         return total;
//     }
// }

class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int up=0;
        int down=0;
        int peak=0;
        int totalcandies=1;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                up++;
                down=0;
                peak=up;
                totalcandies+=1+up;
            }
            else if(ratings[i]==ratings[i-1]){
                totalcandies+=1;
            }
        }
    }
}