class LC_416_PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int x:nums) sum+=x;
        if(sum%2!=0) return false;
        if(subsetSumtoK(n,sum/2,nums)==true) return true;
        return false;
    }
    boolean subsetSumtoK(int n,int k,int [] arr)
    {
        boolean prev[]=new boolean[k+1];
        prev[0]=true;
        if(arr[0]<=k)
        {
            prev[arr[0]]=true;
        }
        for(int i=1;i<n;i++)
        {
            boolean curr[]=new boolean[k+1];
            curr[0]=true;
            for(int target=1;target<=k;target++)
            {
                boolean notTaken=prev[target];
                boolean taken=false;
                if(arr[i]<=target)
                {
                    taken=prev[target-arr[i]];
                }
                curr[target]=notTaken || taken;
            }
            prev=curr;
        }
        return prev[k];
    }
}