class Solution {
    public String removeDuplicates(String s) {

        Stack <Character> st = new Stack<>();
        int n = s.length();
        String res = "";
       

        for(int i=0; i<n; i++) {

            char ch = s.charAt(i);

            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }else{
                st.push(ch);
            }
 }
 
 while(!st.isEmpty()){
    res = st.pop() +res;
 }
        return res;
        
    }
}