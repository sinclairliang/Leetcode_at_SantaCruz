class Solution {
    public boolean isAnagram(String s, String t) {
        // returns true if both empty strings;
        if (s.length() == 0 || t.length() == 0) {
            return true;
        }

        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        // converts to char arrays;

        Arrays.sort(s_array);
        Arrays.sort(t_array);
        // sort them;

        String s_compare = new String(s_array);
        String t_compare = new String(t_array);
        // convert back to string;

        return s_compare.equals(t_compare);
        // compare these two strings;
    }
}