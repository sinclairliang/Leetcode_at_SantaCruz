class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        // made an array to store the frequency of each letter in the string;
        for (int i = 0; i < s.length(); i++) {
            // store the frequencies;
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            // to check the frenquencies again,
            // if the frequency == 1;
            // return that index;
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}