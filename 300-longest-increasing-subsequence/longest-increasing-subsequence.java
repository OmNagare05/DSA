class Solution {

    int fun(int nums[] , int n , int i , int prev , int dp[][]){

        if(i == n){
            return 0;
        }

        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }

        if( prev == -1 || nums[i] > nums[prev]){
            int s1=  1 + fun(nums , n , i+1 , i ,dp);
            int s2 = fun(nums , n , i+1, prev , dp);

            return dp[i][prev+1] = Math.max(s1 , s2);
        }

           return dp[i][prev+1] = fun(nums, n , i+1, prev , dp);
    }
    public int lengthOfLIS(int[] nums) {
         
         int n = nums.length;

         int dp[][] = new int[n+1][n+1];
         for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
         }

         return fun(nums , n , 0 , -1 , dp);
    }
}