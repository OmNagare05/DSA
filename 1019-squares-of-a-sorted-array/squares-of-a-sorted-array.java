class Solution {
    public static int[] sortedSquares(int[] nums) {


        int newarr[] = new int[nums.length];
       
        for(int i=0; i<nums.length; i++){

            newarr[i] = nums[i] * nums[i];
           

        }
         Arrays.sort(newarr);
        return newarr;
        
    }
    public static void main(String args[]){
        int nums[] = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}