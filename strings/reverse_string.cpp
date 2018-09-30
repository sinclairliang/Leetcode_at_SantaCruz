// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/

// faster than a full traversal of array

class Solution {
public:
    string reverseString(string s) {
        if (s.size() == 0 || s.size() == 1) return s;
    
        for (int i = 0, j = s.size() - 1; i < j; ++i, --j) {
            swap(s[i], s[j]);
        }

        return s;
    }
};