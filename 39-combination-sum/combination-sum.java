class Solution {


    void fun(int candidates[] , int n , int indx, int sum, List<Integer> dairy , List<List<Integer>> res , int target){

         if(indx == n){
            if(sum == target){
                res.add(new ArrayList<>(dairy));
                return;
            }
            return;
         }

           

         if(sum + candidates[indx] <= target){     // lena aahe
                dairy.add(candidates[indx]);
                sum = sum + candidates[indx];

                fun(candidates , n , indx , sum , dairy , res , target);

                dairy.remove(dairy.size() -1);
                sum = sum - candidates[indx];
            }

            fun(candidates , n , indx+1 , sum , dairy , res ,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> dairy = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        fun(candidates , candidates.length, 0 , 0 ,  dairy , res ,target);
        return res;
    }
}