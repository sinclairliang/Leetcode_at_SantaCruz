class Solution {
    public int climbStairs(int n) {
        //Base cases
        if(n == 0) {return 0;}
        if(n == 1) {return 1;}
        if(n == 2) {return 2;}

        //How many ways can you get to the ith level = opt[i]
        int[] opt = new int[n];

        //Base cases
        opt[0] = 1;
        opt[1] = 2;
        
        //Compute the maximum number of ways to get to the ith level
        for(int i = 2; i < n; i++)
        {
            //Either we take 1 step up from the (i-1)th level, or we take 2 steps up from the (i-2)th level
            opt[i] = opt[i-1] + opt[i-2];
        }
        
        //Return the maximum number of ways to get to level n
        return opt[n-1];
    }
}