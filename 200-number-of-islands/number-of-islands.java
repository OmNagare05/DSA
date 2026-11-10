class Solution {
    int x[] ={-1 ,1,0,0};
    int y[]  = {0,0,-1,1};
    boolean isValid(char[][] grid , int n , int m , int i , int j){

        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }else{
            return true;
        }

    }

    void dfs(char [][] grid , int n , int m , int i , int j , boolean vis[][]){

        vis[i][j] = true;

        for(int k=0; k<x.length; k++){
              int row = i + x[k];
              int col = j + y[k];

              if(isValid(grid , n , m, row ,col) && grid[row][col] == '1' && vis[row][col] == false ){
                   dfs(grid , n ,m , row , col , vis);
              }
        }
    }
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int i;
        int j;
        boolean vis[][] = new boolean[n][m];
        int ans = 0;


        for( i=0; i<n; i++){
            for( j=0; j<m; j++){
               if(grid[i][j] == '1' && vis[i][j] == false){
                dfs(grid ,n ,m ,i,j,vis);
                 ans++;
               }
            }
        }
        return ans;

    
        
    }
}