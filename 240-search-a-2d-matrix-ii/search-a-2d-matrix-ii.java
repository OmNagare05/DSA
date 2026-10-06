class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;   // n for rows
        int m = matrix[0].length;// m for col

        int row = n-1;
        int col = 0;

        while(row>=0 && col<m){

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                row--;
            }else{
                // if(matrix[row][col]< target)
                col++;
            }
        }
        return false;
        
    }
}