class Solution {
    static final int NO_OF_CHARS = 256;
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null) {
            return 0;
        }
        
        int n = s.length();
        int cur_length = 1;
        int max_length = 1;
        int prev_index;
        int i;
        int visited [] = new int[NO_OF_CHARS];
        
        for(i = 0; i < NO_OF_CHARS; i++) {
            visited[i] = -1;
        }
        
        visited[s.charAt(0)] = 0;
        
        for(i = 1; i < n; i++) {
            prev_index = visited[s.charAt(i)];
            
            if(prev_index == -1 || i - cur_length > prev_index) {
                cur_length++;
            } else {
                if(cur_length > max_length) {
                    max_length = cur_length;
                }
                cur_length = i - prev_index;
            }
            visited[s.charAt(i)] = i;
            
        }
        if(cur_length > max_length) {
            max_length = cur_length;
        }
        return max_length;
    }
}