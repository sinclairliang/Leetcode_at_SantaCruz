class Solution {
    // my solution counts how many time 0, 1 and 2 appears
    // and then rewrite the array.
    public void sortColors(int[] nums) {
        int elements[] = {0, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            elements[nums[i]]++;
        }
        for (int i = 0; i < elements[0]; i++) {
            nums[i] = 0;
        }
        for (int i = elements[0]; i < elements[0] + elements[1]; i++) {
            nums[i] = 1;
        }
        for (int i = elements[0] + elements[1]; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}