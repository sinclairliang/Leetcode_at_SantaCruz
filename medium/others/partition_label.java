class Solution {
    public List<Integer> partitionLabels(String S) {
        char[] S1 = S.toCharArray();
        List<Integer> res = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int n = S1.length;
        int start = 0;
        int last = 0;
        for (int i = 0; i < n; i++) {
            // establishing associations in Hashmap;
            map.put(S1[i], i);
        }

        for (int i = 0; i < n; i++) {
            // traverse the char array again and find the last index of such letter(char);
            last = Math.max(last, map.get(S1[i]));
            if (i == last) {
                // if i is the last, it must be the location;
                res.add(i - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
}