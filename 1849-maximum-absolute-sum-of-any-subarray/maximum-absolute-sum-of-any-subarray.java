class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxsum = nums[0];
        int minsum = nums[0];
        int result =Math.abs(nums[0]);
        int n = nums.length;

        for(int i=1; i<n; i++){

            int s1 = nums[i];
            int s2 = maxsum + nums[i];
            int s3 = minsum + nums[i];

            maxsum = Math.max(s1 , Math.max(s2 ,s3));
            minsum = Math.min(s1 , Math.min(s2 ,s3));

            result = Math.max(result , Math.max(Math.abs(maxsum) ,Math.abs(minsum)));


        }
        return (result);
        
    }
}