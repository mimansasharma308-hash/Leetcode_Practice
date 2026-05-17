class LC_258_AddDigits {
    public int addDigits(int num) {
        int sum=0;
        if(num<10) return num;
        while(num>0)
        {
            int d= num%10;
            sum+=d;
            num=num/10;
        }
        return addDigits(sum);
    }
}