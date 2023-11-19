package Arrays;
import java.util.Arrays;
public class ReductionOperations {
    public static void main(String[] args){

    }
     public int reductionOperations(int[] nums) {
       Arrays.sort(nums);
       int ans =0;
       int red = 0;
       for(int i = 1 ;i< nums.length ;i++){
        if(nums[i] != nums[i-1]){
            red++ ;
        }
        ans += red;
       } 
       return ans;
    }
}
