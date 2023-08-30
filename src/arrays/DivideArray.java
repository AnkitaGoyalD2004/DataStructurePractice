package Arrays;
import java.util.*;
public class DivideArray {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length %k == 0){
            return false;
        }
    Map<Integer , Integer> mp = new HashMap<>();
    for(int num : nums){
        mp.put(num , mp.getOrDefault(num , 0)+1);
    }
    Arrays.sort(nums);
    for(int num : nums){
        if(mp.get(num)  > 0 ){
            for (int i = num + 1; i < num + k; i++) {
                if (mp.getOrDefault(i, 0) == 0) {
                    return false;
                }
                mp.put(i, mp.get(i) - 1);
            }
            mp.put(num, mp.get(num) - 1);
        }
    }

    return true;

        }
}
