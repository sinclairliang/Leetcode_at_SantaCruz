class Solution {
    public int singleNumber(int[] nums) {
        // sort and then linear search;

        Arrays.sort(nums);
        if (nums.length < 2) {
            // return the first element if there is only one element;
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            // if the first element != the second one;
            // return the first one;
            return nums[0];
        }
        if (nums[0] == nums[1]) {
            for (int i = 1; i < nums.length - 1; i += 2) {
                // linear search the different one;
                // increments 2 at a time;
                if (nums[i] != nums[i - 1]) {
                    // if found, compare the (i-1) and (i-2)
                    if (nums[i - 1] == nums[i - 2]) {
                        // if the previous two numbers are the same;
                        // nums[i] must be the different one; 
                        return nums[i];
                    } else {
                        // oherwise, return nums[i-1]
                        // because that means nums[i] == nums[i+1];
                        return nums[i - 1];
                    }
                }
            }
        }
        // if not found anything, it must be the largest number in the array;
        return nums[nums.length - 1];
    }
}