import java.util.Arrays;

public class LC_63_UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //memoization
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int[] row : dp) Arrays.fill(row, -1);
        return func(m-1,n-1,dp,obstacleGrid);
    }
    int func(int i,int j,int dp[][],int obstacleGrid[][])
    {
        if(i < 0 || j < 0) return 0;
        if(obstacleGrid[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=func(i-1,j,dp,obstacleGrid);
        int left=func(i,j-1,dp,obstacleGrid);
        return dp[i][j]=up+left;

    }
} 
