class Solution {
    // use bubble sort technique to shift all zeros to the back;
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length-1;i++)
        {
            for(int j=0; j<nums.length-1;j++)
            {
                if(nums[j] == 0)
                {
                    swap(nums, j, j+1);
                }
            }
        }        
    }
    
    private void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}