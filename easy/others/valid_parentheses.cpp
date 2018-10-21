class Solution {
public:
    bool isValid(string s) {
        vector<char> a;
        
        for (char c : s) {
            switch (c) {
                case ('('):
                    a.push_back(')');
                    break;
                case ('{'):
                    a.push_back('}');
                    break;
                case ('['):
                    a.push_back(']');
                    break;
                case (')'):
                    if (a.size() == 0) return false;
                    else if (c != a.back()) return false;
                    a.pop_back();
                    break;
                case ('}'):
                    if (a.size() == 0) return false;
                    else if (c != a.back()) return false;
                    a.pop_back();
                    break;
                case (']'):
                    if (a.size() == 0) return false;
                    else if (c != a.back()) return false;
                    a.pop_back();
                    break;
            }
        }
        
        return a.size() == 0;
    }
};