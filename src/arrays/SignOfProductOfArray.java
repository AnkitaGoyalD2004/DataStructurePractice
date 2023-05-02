package Arrays;

public class SignOfProductOfArray {
    public int arraySign(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
        // for(int i :nums){
         if(nums[i] == 0 ){
            return 0;
         } 
        if(nums[i]<0){
            count++;
        }
        }
        return  count % 2 == 0 ? 1 : -1;
    }
}
