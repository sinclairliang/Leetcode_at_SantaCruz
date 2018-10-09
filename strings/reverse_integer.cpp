class Solution {
public:
    int reverse(int x) {
        if (x == 0 || x == 1) return x;
        
        long long result = 0;
        //bool neg = x < 0;
        
        while (x % 10 == 0) {
            x /= 10;
        }
        
        while (x != 0) {
            int a = x % 10;
            x /= 10;
            result *= 10;
            result += a;
        }
        
        if (result < INT_MIN || result > INT_MAX) {
            return 0;
        } else {
            return result;
        }
    }
};