class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[0] == nums[1]){
            for(int i=1;i<nums.length-1;i+=2){
                if(nums[i]!=nums[i-1]){
                    if(nums[i-1] == nums[i-2]){
                        return nums[i];
                    } else {
                        return nums[i-1];
                    }
                }
            }
        }
        
        return nums[nums.length-1];
    }
}