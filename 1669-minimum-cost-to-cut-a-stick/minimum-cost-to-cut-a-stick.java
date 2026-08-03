class Solution {

    public int fun(int c[] , int i, int j , int dp[][]){
        int res = Integer.MAX_VALUE;
        if(i>j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
 
        for(int k=i; k<=j ; k++){
            int cost = c[j+1] - c[i-1];

            int r = cost + fun(c , i , k-1 ,dp) + fun(c , k+1 , j, dp);

            res = Math.min(r ,res);
        }
        return dp[i][j] = res;
    }
    public int minCost(int n, int[] cuts) {

        int c [] = new int[cuts.length+2];

        c[0] = 0;
        for(int i=0; i<cuts.length; i++){
            c[i+1] = cuts[i];
        }
        c[c.length-1] = n;
        Arrays.sort(c);
        int s = c.length;

        int dp[][] = new int[s][s];
        for (int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }


        return fun(c , 1 , s-2 , dp);
        
    }
}