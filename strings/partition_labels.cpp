class Solution {
public:
    vector<int> partitionLabels(string S) {

        int m[26];
        vector<int> result;

        for (int i = 0; i < S.size(); ++i) {
            m[S[i] - 'a'] = i; 
        }
        
        int begin = 0;
        int end = 0;
        for (int i = 0; i < S.size(); ++i) {
            end = max(end, m[S[i] - 'a']);
            if (end == i) {
                result.push_back(end - begin + 1);
                begin = end + 1;
            }
        }
        return result;
    }
};