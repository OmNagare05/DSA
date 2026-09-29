class Solution {

      public int firstOccur(int []nums , int target){
        int n = nums.length;
        int low =0;
        int high = n-1;
        int res1 = -1;

        while(low <= high){
            int guess= (low + high) /2;

            if(nums[guess] < target){

                low = guess+1;
                
            }else if(nums[guess] > target){
                high = guess-1;
            }else{
                res1 = guess;
                high = guess-1;
            }
        }
        return res1;

    }
    

    public int secondOccur(int[] nums , int target){
        int m = nums.length;
        int low =0;
        int high = m-1;
        int res2 = -1;

        while(low <= high){
            int guess = (low + high) /2;

            if(nums[guess] < target){

                low = guess+1;
                
            }else if(nums[guess] > target){
                high = guess-1;
            }else{
                res2 = guess;
                low = guess+1;
            }
        }
        return res2;

    }

       
    public int[] searchRange(int[] nums, int target) {

    int first =firstOccur(nums , target);
    int last =secondOccur( nums , target);
    
   return new int[]{first ,last};
    }
     
}
 
