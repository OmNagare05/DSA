class Solution {

    public int happy(int n){
        int sum = 0;

        while(n > 0){
            int d = n % 10;
             n =  n / 10;

            sum = sum + d * d;
        }
        return sum;
    }
    public boolean isHappy(int n) {

        int slow = n ; 
        int fast = n;

        while(fast != 1){
            slow = happy(slow);
            fast  = happy(fast);
            fast = happy(fast);

            if(slow == fast && slow !=1){
                return false;
            }
        }
        return true;
        
    }
}