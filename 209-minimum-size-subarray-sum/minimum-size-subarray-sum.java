class Solution {
    public static  int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int low =0;
        int high = 0;
        int sum  =0;
        int n = nums.length;

        while(high < n){
            sum = sum + nums[high];

            while(sum >= target){
                int length = high - low +1;
                result = Math.min(result , length);
                sum = sum - nums[low];
                low++;

            }
            high++;
           
        }
         if(result == Integer.MAX_VALUE){
            return 0;
         }else{
            return result;
         }

       

        
    }
    public static void main(String args[]){
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target , nums));
    }
}