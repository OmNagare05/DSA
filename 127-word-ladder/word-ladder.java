class Solution {
    class Pair{
        String first;
        int second;

        Pair(String first , int second){
            this.first = first;
            this.second = second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int n = wordList.size();

        HashMap<String , Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            hm.put(wordList.get(i) , 1);
        }

        if(!hm.containsKey(beginWord)){
            hm.put(beginWord , 1);
        }

        if(!hm.containsKey(endWord)){
            return 0;
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord , 1 ));
        hm.remove(beginWord);

        while(!q.isEmpty()){
            Pair p = q.peek();
            q.remove();
            String s = p.first;
            int val = p.second;

            if(s.equals(endWord)){
                return val;
            }


            for(int i=0; i<s.length(); i++){
                char[] arr=s.toCharArray();
                char original = arr[i];

                for(char j='a'; j<='z'; j++){
                    if(original==j){
                        continue;
                    }
                    arr[i] =j;
                    String newword = new String(arr);

                    if(hm.containsKey(newword)){
                        q.add(new Pair(newword , val+1));
                        hm.remove(newword);
                    }
                }
                arr[i]= original;
            }
        }
        return 0;
        
    }
}