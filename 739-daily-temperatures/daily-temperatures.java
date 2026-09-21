class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int [] result = new int[n];
        Stack<Integer> s = new Stack<>();

        result[n-1] = 0;

        s.push(n-1);

        for(int i= n-2; i>=0; i--){

            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                result[i] = 0;
            }else{
                result[i] = s.peek() - i;
            }

            s.push(i);
        }
      
      return result;

        
    }
}