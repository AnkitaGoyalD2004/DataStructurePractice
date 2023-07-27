package HashMap;
import java.util.*;
public class FourSum {
    // Brute Force
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                long res = (nums[i] + nums[j]);
                long rem = target - res;
            
                int left=j+1;
                int right=nums.length-1;
                while(left<right)
                {
                    long sum=nums[left]+nums[right];
                    if( sum == rem)
                    {
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        if(!ans.contains(temp))ans.add(temp);
                        left++;
                        right--;
                    }
                    else if(sum<rem)
                    {
                        left++;
                        
                    }
                    else if(sum>rem){
                       right--;
                    }
                    
                }
            }

        }
        return ans;
        

    }
}
