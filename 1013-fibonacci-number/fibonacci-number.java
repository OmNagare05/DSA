class Solution {


    public int fib(int n) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        
        if(n==0 || n==1){
            return n;
        }

        if(!hm.containsKey(n)){
            hm.put(n , 1);
        }

        int s1 = fib(n-1);
        int s2 = fib(n-2);
        int ans = s1+s2;
        hm.put(ans ,1);
        return ans;

    }
}