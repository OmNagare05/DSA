class Solution {
    public int findMaxLength(int[] nums) {

        int one = 0;
        int zero =0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        int res = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){

            if(nums[i] == 0){
                zero++;
            }else{
                one++;
            }
            int diff = zero - one;

            if(diff == 0){
                res = Math.max(res , i+1);
                continue;
            }
           

            if(hm.containsKey(diff)){
                int length = i - hm.get(diff);
                      res = Math.max(length , res);
            }else{
                 hm.put(diff , i);
            }

        }
        return res;

        
    }
}