class Solution {
    public boolean fun(String s , String t , int i , int j , int n , int m , Boolean dp[][]){

        if(i==n ){
            return true;
            
        }
        if(j == m){
            return false;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){
           
            boolean s1 = fun(s , t , i+1 , j+1 , n , m, dp);
            boolean s2 = fun(s, t,  i , j+1 , n  ,m, dp);
            return dp[i][j] =  s1 || s2;
            
        }
           
          return dp[i][j] = fun(s , t , i, j+1 , n ,m, dp);
     }
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int n = s.length();
        int m = t.length();
        Boolean dp[][] = new Boolean[n+1][m+1];

        return fun(s , t , i , j , n , m , dp);
        
    }
}