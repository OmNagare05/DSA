class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int target  =0;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){

            int left = i+1;
            int right = nums.length-1;
            int sum = -1 * nums[i];

            if(i > 0 && nums[i] == nums[i-1])continue;
            
            while(left < right){
                int s = nums[left] + nums[right];

                if(sum == s){
                    result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));

                    
                 left++;
                 right--;
                while(left < right  && nums[left] == nums[left - 1]){
                    left++;
                }
                while(left < right && nums[right] == nums[right + 1]){
                    right--;
                }

                
                }
               
                else if( s < sum){

                     left++;
                }
                else {

                      right--;
                }
           }



        }


       return result;
        
    }

    public static void main(String args[]){
        Solution obj = new Solution();
        int nums[] ={-1, 0 , 1, 2, -1, -4};

        List<List<Integer>> res = obj.threeSum(nums);

        System.out.print(res);

    }
}