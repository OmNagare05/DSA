class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalsum = nums[0];
        int currmax =nums[0];
        int currmin =nums[0];
        int maxsum = nums[0];
        int minsum = nums[0];
        int n = nums.length;

        for(int i=1; i<n; i++){

            totalsum +=nums[i];

            currmax = Math.max(nums[i] , currmax+nums[i]);
            maxsum = Math.max(maxsum , currmax);

            currmin = Math.min(nums[i] , currmin+ nums[i]);
            minsum = Math.min(minsum , currmin);

           
             

        }
        if(maxsum < 0){
            return maxsum;
        }
        return Math.max(maxsum , totalsum-minsum);

        
    }
}