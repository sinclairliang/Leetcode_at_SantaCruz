
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // used a brute force method to solve;
//         // it seems there is HashMap method, which is faster;
//         // but I don't understand;
//         int[] res = new int[2];
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     res[0] = i;
//                     res[1] = j;
//                     return res;
//                 }
//             }
//         }
//         return res;
//     }
// }

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int complement;

        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution");

    }
}