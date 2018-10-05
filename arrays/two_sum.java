class Solution {
    public int[] twoSum(int[] nums, int target) {
        // used a brute force method to solve;
        // it seems there is HashMap method is faster;
        // but I don't understand;
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;  
    }
}