package Arrays;
import java.util.HashMap;
public class ContiguousArray {
    //TLE occur (brute force)
    public static int maxLength(int nums[]){
        int count =0;
        for(int i=0;i<nums.length;i++){
         int zeros =0,ones=0;
         for (int j = i; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeros++;
            } else {
                ones++;
            }
            if (zeros == ones) {
                count = Math.max(count, j - i + 1);
            }
        }
    }
    return count;
         }
        
    //O(n)-hashmap
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>  hsmap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : nums[i]);
            if(sum == 0)
                maxLength = i+1;
            else if(hsmap.containsKey(sum)) {
                maxLength = Math.max(maxLength,i - hsmap.get(sum));
            }
            else 
                hsmap.put(sum,i);
        }
        return maxLength;
    }
}
