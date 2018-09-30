class Solution:
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        if (len(nums) < 2): return
        
        if (k > len(nums)): k = k - len(nums)
        
        nums_copy = nums.copy()
        for i in range(len(nums) - 1, -1, -1):
            nums[i] = nums_copy[i-k]
        
        return 
