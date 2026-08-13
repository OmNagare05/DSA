class Solution {
    public int maxSubArray(int[] nums) {

        int best_ending = nums[0];
        int ans  = nums[0];
        int n = nums.length;

        for(int i=1; i<n; i++){

            int s1 = best_ending + nums[i];

            int s2 = nums[i];

            best_ending = Math.max(s1 , s2);

            ans = Math.max(best_ending , ans);
        }
        return ans;
        
    }
}