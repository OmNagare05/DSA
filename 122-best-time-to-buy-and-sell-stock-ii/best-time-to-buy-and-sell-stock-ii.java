class Solution {

    int fun(int prices[] , int n , int i , int k , int [][]dp){

        if(i==n){
            return 0;

        }
        if(k ==0){
            return 0;
        }
        if(dp[i][k] != -1){
            return dp[i][k];
        }
        if(k==2){
            int s1 = fun(prices , n , i+1 , k-1 ,dp) - prices[i];
            int s2 = fun(prices , n , i+1, k , dp);

            return dp[i][k] = Math.max(s1 , s2);
        }
        else{
            int s1 = fun(prices , n , i+1 , 2 , dp)+ prices[i];
            int s2 = fun(prices , n , i+1 , k , dp);

            return dp[i][k] = Math.max(s1 ,s2);
        }

    }
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int k = 2;
        int dp[][] = new int[n+1][k+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=k; j++){
                dp[i][j] = -1; 
            }
        }

        return fun(prices , n , 0 , k , dp);
    }
}