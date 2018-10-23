class Solution {
    public boolean isPalindrome(String s) {
        // strips all but letters and converts them to lower case
        // then compares with the reverse string;
        String to_compare = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.print(to_compare);
        String reversed = new StringBuilder(to_compare).reverse().toString();
        return to_compare.equals(reversed);
    }
}