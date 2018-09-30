// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/

// I think this is the fastest way you can do it, maybe you can reduce a few instructions/syscalls
// but this is definitely the right method

class Solution {
public:
    bool isPalindrome(string s) {
        
        if (s.size() == 1 || s.size() == 0) return true;
        
        int i = 0;
        int j = s.size() - 1;
        
        while (i < j) {
            while (!isalnum(s[i]) && i < j) ++i;
            while (!isalnum(s[j]) && i < j) --j;
            
            if (tolower(s[i]) != tolower(s[j])) return false;
            
            ++i; --j;
        }
        
        return true;
    }
};