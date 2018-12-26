class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums.length;
        }
        int prev = 1;
        int curr = 2;
        while (curr < nums.length) {
            if (nums[curr] == nums[prev] && nums[curr] == nums[prev - 1]) {
                curr++;
            } else {
                prev++;
                nums[prev] = nums[curr];
                curr++;
            }
        }
        return prev + 1;
    }
}