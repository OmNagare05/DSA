class Solution {
    public  static int totalFruit(int[] fruits) {
        int k = 2;
        int low =0;
        int maxlength=-1;
        int n = fruits.length;
        HashMap <Integer , Integer> hm = new HashMap<>();

        for(int high=0; high<n; high++){
            hm.put(fruits[high]  , hm.getOrDefault(fruits[high], 0) +1);

            while(hm.size() > k){
                hm.put(fruits[low] , hm.get(fruits[low]) -1);

                if(hm.get(fruits[low]) == 0){
                    hm.remove(fruits[low]);
                }
                low++;
            }

            if(hm.size() < k || hm.size() == k){

                int length = high - low +1;
                maxlength = Math.max(length , maxlength);
            }
        }
        return maxlength;
        
    }
    public static void main(String args[]){
        int fruits[] = {1,2,1};
        System.out.println(totalFruit(fruits));
        
    }
}