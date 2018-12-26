class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // I have two pointers to keep track the value of sum;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        // a list of lists that contains every results;

        if (nums == null || nums.length < 3) {
            // if nums are shorter than 3;
            return res;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> l = new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);

                        res.add(l);

                        j++;
                        k--;

                        while (j < k && nums[j] == nums[j - 1]) {
                            // increment the pointer until we see the number changes;
                            j++;
                        }

                        while (j < k && nums[k] == nums[k + 1]) {
                            // decrement the pointer until we see the number changes;
                            k--;
                        }
                    } else if (nums[i] + nums[j] + nums[k] < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return res;
    }
}