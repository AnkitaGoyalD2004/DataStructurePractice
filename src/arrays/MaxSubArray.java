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
	 public static void main(String[] args) {
			int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
			System.out.print(maxSubArray(arr));
		}
}
