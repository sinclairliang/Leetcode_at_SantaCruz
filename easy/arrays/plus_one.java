class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1] = digits[digits.length-1]+1;
        return fix(digits);
    }
    private int[] fix(int[] to_fix)
    {
        // helper function to fix the over_10 digits;
        for(int i=to_fix.length-1; i>0; i--)
        {
            // iterate backwards to correct carry_over;
            if(to_fix[i] >= 10)
            {
                // once found;
                // increment the digit in front of it by 1;
                // decrement this digit by 10;
                to_fix[i-1] += 1;
                to_fix[i] -= 10;
            }
        }
        
        // to check if the first digit is greater than 10;
        if(to_fix[0] < 10)
        {
            // if not we are all set;
            return to_fix;
        }
        else
        {
            // otherwise we create a new array with size+1;
            // and copy all the numbers over;
            int[] res = new int[to_fix.length+1];
            res [0] = 1;
            res [1] = 0;
            for(int j=2; j<res.length;j++)
            {
                res[j] = to_fix[j-1];
            }
            return res;
        }
    }
}