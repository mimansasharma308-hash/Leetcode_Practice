class LC_708 {
    public int rotatedDigits(int n) {
        int count=0;
        if(n==1) return 0;
        if(n==2) return 1;
        for(int i=1;i<=n;i++)
        {
            if(good(i)==true) count++;
        }
        return count;
    }
    boolean good(int n)
    {
        boolean flag=false;
        while(n>0)
        {
            int d=n%10;
            if(d==3 ||d==4 ||d==7) 
            {
                return false;
            }
            if(d==2 ||d==5||d==6||d==9) flag=true;
            n=n/10;
            
        }
        return flag;
    }
}