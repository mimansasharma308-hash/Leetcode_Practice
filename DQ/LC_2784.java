import java.util.Arrays;
import java.util.HashMap;
class LC_2784 {
    public boolean isGood(int[] nums) {

        Arrays.sort(nums);

        int n = nums[nums.length - 1];
        int s = nums.length;

        if(s != n + 1)
            return false;

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int x : nums)
        {
            hash.put(x, hash.getOrDefault(x,0) + 1);
        }

        for(int i = 1; i < n; i++)
        {
            if(hash.getOrDefault(i,0) != 1)
                return false;
        }

        if(hash.getOrDefault(n,0) != 2)
            return false;

        return true;
    }
}