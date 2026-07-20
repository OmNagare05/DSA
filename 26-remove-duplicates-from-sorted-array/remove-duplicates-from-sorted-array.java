class Solution {
    public static int removeDuplicates(int[] nums) {

        int k =1;
        int i =0;
        int j = i+1;
        int n = nums.length;
        while(j<n){

            if(nums[j] == nums[j-1]){
               j++;
            }
            else{
               nums[i+1] = nums[j];
               i++;
               j++;
               k++;
              
            }
        }
        return k;
        
    }

    public static void main(String args[]){
        int nums[] ={1,1,2};
        System.out.println(removeDuplicates(nums));

    }
}