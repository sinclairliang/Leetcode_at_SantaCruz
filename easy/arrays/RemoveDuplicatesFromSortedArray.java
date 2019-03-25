class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 1;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == nums[j]) {
                i++;
            } else {
                j++;
                nums[j] = nums[i];
                i++;
                count++;
            }
        }
        return count;
    }
}