class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        if (nums.size() == 0 || nums.size() == 1) return false;
        unordered_set<int> a;
        
        for (int c : nums) {
            if (a.find(c) != a.end()) return true;
            else {
                a.insert(c);
            }
        }
        return false;
    }
};