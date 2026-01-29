class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> set = new HashSet<>(wordList);
        set.add(beginWord);
        
        if(!set.contains(endWord)){
            return 0;
        }
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int wlen = beginWord.length();
        int level = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
            String cur = queue.poll();

            if(cur.equals(endWord)){
                return level;
            }
            char[] curr = cur.toCharArray();
            for(int i  = 0 ; i < wlen ; i++){
                char temp = curr[i];
                for(char ch = 'a' ; ch<='z' ; ch++){
                    curr[i] = ch;
                    cur = new String(curr);
                    if(set.contains(cur)){
                        set.remove(cur);
                        queue.add(cur);
                    }
                }
                curr[i] = temp;
            }
        }
         level++;
        }
        return 0;
    }
}