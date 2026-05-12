class LC_2553 {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        int d=0;
        String ans="";
        for(int i=0;i<n;i++)
        {
            ans=ans+nums[i];
        }
        int a=ans.length();
        int res[]=new int[a];
        for(int i=0;i<a;i++)
        {
            char ch=ans.charAt(i);
            res[i]=ch-'0';
        }
        return res;
    }
}