class Solution {

    void fun( String digits , int n , int idx, StringBuilder temp , List<String> res , HashMap<Character , String> hm){

        if(idx == n){
            res.add(temp.toString());
            return;
        }

        String choice = hm.get(digits.charAt(idx));

        for(int j =0; j<choice.length(); j++){
            temp.append(choice.charAt(j));
            fun(digits , n , idx+1, temp , res ,hm);
            temp.deleteCharAt(temp.length()-1);
        }


    }
    public List<String> letterCombinations(String digits) {

        HashMap<Character , String> hm = new HashMap<>();
        hm.put('2' , "abc");
        hm.put('3' , "def");
        hm.put('4' , "ghi");
        hm.put('5' , "jkl");
        hm.put('6' , "mno");
        hm.put('7',  "pqrs");
        hm.put('8' , "tuv");
        hm.put('9' , "wxyz");


        StringBuilder temp = new StringBuilder();
        List<String> res = new ArrayList<>();

        fun(digits , digits.length() ,0 , temp , res , hm);
        return res;
        
    }
}