class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;

        while(i < j){
            int sum  = numbers[i] +  numbers[j];

            if(sum == target){
                return new int[]{i + 1 , j + 1};
            }
            else if(sum < target){
                i++;

            }
            else{
                j--;
            }
        }
        return new int[]{-1 , -1};
        
    }
    public static void main(String args[]){
        Solution obj = new Solution();
        int numbers[] = {2,7,11,13};
        int target = 9;

        int result [] = obj.twoSum(numbers, target);
        System.out.println(result[0] + "," + result[1]);
    }
}