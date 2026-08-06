class Solution {
    public int fun(int cost[] , int n , int i , int dp[] ){
        if(i== n){
            return 0;
        }
        if(i > n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }
       
        int s1 = fun(cost ,n , i+1, dp);
        int s2 = fun(cost , n ,i+2 , dp);
        return dp[i] = cost[i] + Math.min(s1 , s2);
    }
        
    
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }


        return Math.min(fun(cost ,n , 0 , dp) , fun(cost ,n, 1 , dp));
        
        
    }
}