class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        // Created a count Map to store frequencies of each character;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }

            // Here we have a character - frequency binding;
        }

        int answer = 0;
        for (int count : countMap.values()) {
            if (count % 2 == 0) {
                answer += count;
            } else {
                answer += count / 2 * 2;
                if (answer % 2 == 0) {
                    answer += 1;
                }

            }
        }
        return answer;
    }
}