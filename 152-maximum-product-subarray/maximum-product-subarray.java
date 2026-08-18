class Solution {
    public int maxProduct(int[] nums) {

        int res = nums[0];
        int min= nums[0];
        int max = nums[0];
        int n = nums.length;

        for(int i=1; i<n; i++){

           int s1 = nums[i];
           int s2 = max * nums[i];
           int s3 = min * nums[i];

           max = Math.max(s1 , Math.max(s2, s3));
           min = Math.min(s1 , Math.min(s2, s3));

           res = Math.max(res , Math.max(max , min));

           

           

        }
        return res;
        
    }
}