class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low =0;
        int high = n-1;
        int res = -1;

        while(low <= high){
            int guess = (low + high)/2;

            if(nums[guess] > nums[n-1]){
                low = guess+1;
            }else{
                // nums[guess] < arr[n-1];
                  res = nums[guess];
                  high = guess -1;
            }
        }
        return res;
        
    }
}