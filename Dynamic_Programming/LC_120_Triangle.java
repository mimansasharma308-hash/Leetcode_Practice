import java.util.Arrays;
import java.util.List;
class LC_120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        //memoization
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int[] rows:dp) Arrays.fill(rows,-1);
        return func(0,0,triangle,n,dp);

    }
    int func(int i,int j,List<List<Integer>> triangle,int n,int dp[][])
    {
        if(i==n-1) return triangle.get(i).get(j);
        if(dp[i][j]!=-1) return dp[i][j];
        int d=triangle.get(i).get(j)+func(i+1,j,triangle,n,dp);
        int dg=triangle.get(i).get(j)+func(i+1,j+1,triangle,n,dp);
        return dp[i][j]=Math.min(d,dg);

    }
}