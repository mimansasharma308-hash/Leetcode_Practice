class LC_198_HouseRobber {
    public int rob(int[] nums) {
        //Dynamic Programming
        int n=nums.length;
        if(n==1) return nums[0];
        int pick=0;
        int notpick=0;
        int prev2=0;
        int prev=nums[0];
        if(nums.length==0) return 0;
        for(int i=1;i<n;i++)
        {
            pick=nums[i]+prev2;
            notpick=prev;
            int curri=Math.max(pick,notpick);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
}