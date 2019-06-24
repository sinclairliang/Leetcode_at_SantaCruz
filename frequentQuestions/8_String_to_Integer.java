class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str == null || str.length() == 0)
            return 0;

        int sign = 1;
        int res = 0;
        int i = 0;

        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            if (str.charAt(0) == '-') {
                sign = -1;
            }
            i++;
        }

        for (; i < str.length(); i++) {
            int temp = str.charAt(i) - '0';
            if (temp < 0 || temp > 9) {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)) {
                // handling over flow;
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else {
                res = res * 10 + temp;
            }
        }
        return res * sign;
    }
}