class Solution {


    int fun(int nums[] , int n , int i ,int free, int res[][]){

        if(i==n){
            return 0;
        }

        if(res[i][free] != -1){
            return res[i][free];
        }
        if(free==0){
           return res[i][free] = fun(nums , n , i+1 , 1 , res);
        }
        int s1 = nums[i] + fun(nums , n , i+1, 0 , res);
        int s2 = fun(nums , n , i+1, 1, res);

        return res[i][free] = Math.max(s1 , s2);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int res[][] = new int[n][2];

        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                res[i][j] = -1;
            }
        }

       return fun(nums, n, 0, 1, res);
        
    }
}