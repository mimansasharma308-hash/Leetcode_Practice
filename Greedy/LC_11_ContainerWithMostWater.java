class LC_11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            int area=Math.min(height[right],height[left])*(right-left);
            max=Math.max(max,area);
            if(height[right]<=height[left])
            {
                right--;
            }
            else
            {
                left++;;
            }
        }
        return max;
     }
}