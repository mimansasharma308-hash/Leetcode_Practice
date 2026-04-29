import java.util.Arrays;
class LC_64_MinPathSum {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int[] x:dp) Arrays.fill(x,-1);
        int min=Integer.MAX_VALUE;
        return func(m-1,n-1,dp,grid);
    }
    int func(int m,int n,int dp[][],int grid[][])
    {
        if(m==0 && n==0) return grid[0][0];
        if(m<0 || n<0) return Integer.MAX_VALUE;
        if(dp[m][n]!=-1) return dp[m][n];
        int up=func(m-1,n,dp,grid);
        int left=func(m,n-1,dp,grid);
        return dp[m][n]=grid[m][n]+Math.min(up,left);
    }
}