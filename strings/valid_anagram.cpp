// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
// 99.12% percentile

class Solution {
public:
    bool isAnagram(string s, string t) {
        
        if (s.size() != t.size()) return false;
        
        //unordered_map<char, int> char_set;
        int char_set[128] = { 0 };
        
        // add one to the count for each of the chars s contains,
        // subtract one for each of the chars t contains
        for (int i = 0; i < s.length(); ++i) {
            char_set[s[i]] += 1;
            char_set[t[i]] -= 1;
        }
        
        for (int c : char_set) {
            // if there are not the same number of chars,
            // the second string is not an anagram.
            if (c != 0) return false;
        }
        
        return true;
    }
};