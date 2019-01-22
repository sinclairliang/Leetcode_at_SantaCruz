class Solution {
    public String getHint(String secret, String guess) {
        int countBull = 0;
        int countCow = 0;
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);

            if (c1 == c2) {
                countBull++;
            } else {
                arr1[c1 - '0']++;
                arr2[c2 - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            countCow += Math.min(arr1[i], arr2[i]);
        }
        return countBull + "A" + countCow + "B";
    }
}