class Solution {
    public static int lengthOfLongestSubstring(String s) {

        int low =0;
        int result = 0;
        HashMap<Character , Integer>hm = new HashMap<>();

        for(int high =0; high<s.length(); high++){
            char ch = s.charAt(high);
            hm.put(ch , hm.getOrDefault(ch , 0)+1);

            int k = high - low +1;

            while(hm.size() < k){
                char lowchar = s.charAt(low);
                hm.put(lowchar , hm.get(lowchar)-1);
                if(hm.get(lowchar) == 0){
                    hm.remove(lowchar);
                }
                low++;
                k = high - low +1;
            }

            if(hm.size()==k){
                int length= high - low +1;
                result = Math.max(length , result);
            }

        }
        return result;

        
    }

    public static void main(String args[]){
        String s ="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}