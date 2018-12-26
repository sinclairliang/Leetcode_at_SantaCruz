class Solution {
    public int reverse(int x) {
        Boolean flag = false;
        String result_string = "";

        if (x < 0) {
            // to check if the number is negative;
            // return true if it is negative;
            flag = true;
            x = -1 * x;
        }

        String string_value = String.valueOf(x);
        // convert integer to string; 
        StringBuilder result_string_builder = new StringBuilder();
        for (int i = string_value.length() - 1; i >= 0; i--) {
            result_string_builder.append(string_value.charAt(i));
        }
        // reverse it as a string;
        result_string = result_string_builder.toString();
        // back to string;
        try {
            if (flag == true) {
                // if it is negative, then we multiply with (-1);
                return (-1) * Integer.valueOf(result_string);
            }
            return Integer.valueOf(result_string);
        } catch (Exception e) {
            // if out of bounds;
            return 0;
        }
    }
}