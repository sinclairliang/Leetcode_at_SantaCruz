class Solution {
public:
    int longestValidParentheses(string s) {
        if (s.size() < 2) return 0;
        
        vector<int> stack;
        stack.push_back(-1);
        int max_len = 0;
        
        for (int i = 0; i < s.size(); ++i) {
            int s_top = stack.back();
            
            if (s_top != -1 && s[i] == ')' && s[s_top] == '(') {
                stack.pop_back();
                max_len = max(max_len, i - stack.back());
            } else {
                stack.push_back(i);
            }
        }
        
        return max_len;
    }
};