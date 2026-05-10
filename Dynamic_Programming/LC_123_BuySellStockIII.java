class LC_123_BuySellStockIII {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int after[][] = new int[2][3];
        int curr[][] = new int[2][3];

        for(int ind = n-1; ind >= 0; ind--)
        {
            for(int buy = 0; buy <= 1; buy++)
            {
                for(int cap = 1; cap <= 2; cap++)
                {
                    if(buy == 1)
                    {
                        curr[buy][cap] =
                            Math.max(
                                -prices[ind] + after[0][cap],
                                after[1][cap]
                            );
                    }
                    else
                    {
                        curr[buy][cap] =
                            Math.max(
                                prices[ind] + after[1][cap-1],
                                after[0][cap]
                            );
                    }
                }
            }

            for(int i = 0; i < 2; i++)
            {
                System.arraycopy(curr[i],0,after[i],0,3);
            }
        }

        return after[1][2];
    }
}