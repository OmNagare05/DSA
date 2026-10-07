class Solution {

    void fun (int n , int open , int close , StringBuilder temp , List<String> res){

        if(temp.length() == 2 * n){
            res.add(temp.toString());
            return;
        }

        // for open open<n

        if(open < n){
            temp.append('(');
            fun(n , open+1 , close, temp , res);
            temp.deleteCharAt(temp.length()-1);
            
        }

        // for close open > close

        if(open > close){
            temp.append(')');
            fun(n , open , close+1, temp , res);
            temp.deleteCharAt(temp.length()-1);
        }
    }


    public List<String> generateParenthesis(int n) {


        StringBuilder temp = new StringBuilder();
        List<String> res = new ArrayList<>();
       

         fun(n , 0 , 0, temp , res);
        return res;

        
    }
}