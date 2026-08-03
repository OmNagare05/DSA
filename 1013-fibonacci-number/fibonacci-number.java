class Solution {

    public int fun(int n , int dp[]){

        if(n ==0 || n==1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int ans1 = fun(n-1 , dp);
        int ans2 = fun(n-2 , dp);

        return dp[n] = ans1 + ans2;
    }
    public int fib(int n) {

        int []dp = new int[n+1];

        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }

        return fun(n , dp);
        
    }
}