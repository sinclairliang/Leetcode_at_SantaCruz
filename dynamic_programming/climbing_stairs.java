class Solution {
    public int climbStairs(int n) {
        if(n == 0) {return 0;}
        if(n == 1) {return 1;}
        if(n == 2) {return 2;}
        int[] opt = new int[n];
        opt[0] = 1;
        opt[1] = 2;
        
        for(int i = 2; i < n; i++)
        {
            opt[i] = opt[i-1] + opt[i-2];
        }
        
        return opt[n-1];
    }
}