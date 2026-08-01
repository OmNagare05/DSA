class Solution {
    public int fun(int k , int prices[],  int i , int n , int dp[][]){

        if(i== n){
            return 0;
        }
        if(k == 0){
            return 0;
        }
      
        if(dp[i][k] != -1){
            return dp[i][k];
        }

        if(k % 2 ==0){
            int s1 = fun(k-1 , prices , i+1 , n , dp) - prices[i];
            int s2 = fun(k , prices , i+1, n ,dp);
            return dp[i][k] = Math.max(s1 , s2);
        }
        else{
            int s1 = fun(k-1 , prices , i+1 , n , dp) + prices[i];
            int s2 = fun(k , prices , i+1 , n , dp);

            return dp[i][k] = Math.max(s1 , s2);
        }
    }
    public int maxProfit(int k, int[] prices) {

        int n = prices.length;
        k = k*2;
        int dp[][] = new int[n+1][k+1];
       

        for(int i=0; i<=n; i++){
            for(int j=0; j<=k; j++){
                dp[i][j] = -1;

            }
        }

        return fun( k ,prices , 0 , n , dp);
        
    }
}