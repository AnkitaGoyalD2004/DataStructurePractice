package HashMap;
import java.util.HashMap;
public class SubarraysDivByK {
	public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int rema=0;
        int curr=0;
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        h.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            rema=sum%k;
            if(rema<0)
            {
                rema=rema+k;
            }
            if(h.containsKey(rema))
            {
                curr=curr+h.get(rema);
            }
            h.put(rema,h.getOrDefault(rema,0)+1);
        }
        return curr; 
    }
}
