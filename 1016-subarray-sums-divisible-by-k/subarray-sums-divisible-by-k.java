class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int sum =0;
        int count =0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        hm.put(0,1);
        int n = nums.length;

        for(int i=0; i<n; i++){

            sum+=  nums[i];
            int rem = sum%k;

            if(rem < 0){
                rem = rem +k;
            }
          if(hm.containsKey(rem)){
            count +=hm.get(rem);
              
          }

          
          hm.put(rem , hm.getOrDefault(rem , 0)+1);
        

        }
        return count;
        
    }
}