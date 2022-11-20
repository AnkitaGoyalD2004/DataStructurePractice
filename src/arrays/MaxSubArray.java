package arrays;

public class MaxSubArray {

	 public static int maxSubArray(int[] nums) {
	        int a = nums.length;
	        int Compmax = Integer.MIN_VALUE, sum = 0;
	        
	        for(int i=0;i<a;i++){
	            sum += nums[i];
	           Compmax = Math.max(sum,Compmax);
	            
	            if(a<0) a= 0;
	        }
	        return Compmax;
	 }
}
