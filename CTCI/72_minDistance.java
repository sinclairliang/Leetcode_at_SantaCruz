class Solution {
    public int minDistance(String word1, String word2) {
        if (word1 == null && word2 == null) {
            return 0;
        }
        if (word1 == null && word2 != null) {
            return word2.length();
        }
        if (word1 != null && word2 == null) {
            return word1.length();
        }

        int m = word1.length();
        int n = word2.length();

        int[][] cost = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            cost[i][0] = i;
        }

        for (int i = 0; i <= n; i++) {
            cost[0][i] = i;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    cost[i + 1][j + 1] = cost[i][j];
                } else {
                    int a = cost[i][j];
                    int b = cost[i][j + 1];
                    int c = cost[i + 1][j];

                    if (a < b) {
                        cost[i + 1][j + 1] = (a < c ? a : c);
                    } else {
                        cost[i + 1][j + 1] = (b < c ? b : c);
                    }
                    cost[i + 1][j + 1]++;
                }
            }
        }
        // test the water
        return cost[m][n];
    }
}