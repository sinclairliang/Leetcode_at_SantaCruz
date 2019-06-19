class Solution {
    String res = "";

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return s;
        for (int i = 0; i < s.length(); i++) {
            expandHelper(s, i, i);
            expandHelper(s, i, i + 1);

        }
        return res;

    }

    private void expandHelper(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin)==s.charAt(end)) {
            begin--;
            end++;
        }
        String cur = s.substring(begin+1, end);
        if (cur.length() > res.length()) {
            res = cur;
        }
        
    }
}