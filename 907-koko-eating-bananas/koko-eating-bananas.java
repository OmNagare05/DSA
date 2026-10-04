class Solution {

    public long fun(int [] piles , int n , int guess){

        long hours = 0;
        for(int i=0; i<n; i++){
            hours = hours+ piles[i] / guess;

            if(piles[i] % guess != 0){
                hours = hours+1;
            }
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int low =1;
        int res = -1;
         int high = piles[0];
        for(int i=1; i<n; i++){

            if(piles[i] > high){
                high = piles[i];
            }
         }

            while(low <= high){
                int guess = low+(high - low)/2;
                long hour = fun(piles ,n , guess);
                if(hour > h){
                    low = guess+1;
                }else{
                    // hour < h
                    res = guess;
                    high = guess-1;

                }
            }
        
        return res;

        
    }
}