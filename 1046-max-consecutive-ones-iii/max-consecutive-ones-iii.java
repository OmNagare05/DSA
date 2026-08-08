class Solution {
    public static int longestOnes(int[] nums, int k) {
        

        int low =0;
        int zeros = 0;
        int maxlen = 0;
       
        int n = nums.length;

        for(int high=0; high<n; high++){

           if(nums[high] == 0){
             zeros++;
           }

           while(zeros > k){
            if(nums[low] == 0){
                zeros--;
            }
            low++;
          
           }
             int length = high -low +1;
            maxlen = Math.max(maxlen , length);
            
        }
     return maxlen;


}



    public static void main(String args[]){
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.out.println(longestOnes(nums , k));


    }
}