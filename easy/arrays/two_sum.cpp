class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        unordered_map<int, int> set;
        
        for (int i = 0; i < nums.size(); ++i) {
            int num = nums[i];
            auto it = set.find(num);
            if (it != set.end()) {
                return { it->second, i };
            } 
            set[target - num] = i;
        }
        
        return {};
    }
};