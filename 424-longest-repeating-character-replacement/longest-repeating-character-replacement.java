class Solution {
    public static  int characterReplacement(String s, int k) {

        int low =0;
        int maxfreq =0;
        int maxlen = 0;

        HashMap <Character , Integer> hm = new HashMap<>();


        for(int high =0; high<s.length(); high++){
            char ch = s.charAt(high);

            hm.put(ch , hm.getOrDefault(ch , 0)+1);


            int length = high -low +1;
            maxfreq = Math.max(maxfreq , hm.get(ch));
            int diff = length - maxfreq;

            while(diff > k){
                char lowchar = s.charAt(low);

                hm.put(lowchar , hm.get(lowchar)-1);

                low++;

                length = high - low +1;
                diff =  length- maxfreq;
               
            }
             maxfreq = Math.max(maxfreq , hm.get(ch));

            //  length = high - low +1;
            //  maxlen = Math.max(length , maxlen);
            //  diff = length - maxlen;

             if(diff < k || diff == k){
                length =high - low +1;
                
             }
             maxlen = Math.max(length , maxlen);


        }
        return maxlen;
        
    }
    public static void main(String args[]){
        String s = "ABAB";
        int k=2;
        System.out.println( characterReplacement(s, k));
    }
}