class Solution {
    public int myAtoi(String str) {
        if (str.isEmpty()) {
            // if empty,
            // returns 0;
            return 0;
        }

        str = str.trim();
        // trim off white spaces;

        if (str.isEmpty()) {
            // assess again after trimming off white spaces;
            return 0;
        }

        // initialising values;
        int sign = 1;
        int res = 0;
        int i = 0;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            // assign value to sign
            if (str.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        for (; i < str.length(); i++) {
            // convert string to integer via ascii values;
            int temp = str.charAt(i) - '0';
            if (temp < 0 || temp > 9) {
                break;
            }

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)) {
                // this is the tricky case;
                // if res within 10 from Integer.MAX_VALUE and temp is greater than module of 10;
                // which means if we add res and temp will cause overflow;
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                }
                return Integer.MIN_VALUE;
            } else {
                res = res * 10 + temp;
            }
        }
        return res * sign;
    }
}