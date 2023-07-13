package Arrays;

public class ProductExceptSelf {
    public static void main(String[] args){
        
    }
    //Brute Force 0(n^2) -----> gives me TLE
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i = 0 ; i<= n-1 ; i++){
            int product  = 1;
            for(int j = 0 ; j <= n-1 ; j++){
                if(i==j){continue;}
                product *= nums[j];
            }
            arr[i] = product;
        } 
        return arr;
        }

        //another approach
        public int[] product(int arrs[]){
            int ans[] = new int[arrs.length];
            int pre  = 1 , post = 1;
            for(int i = 0 ; i < arrs.length ; i++){
                ans[i] = pre;
                pre *= arrs[i];
            }
            for(int j = arrs.length-1 ; j >=0 ;j--){
                ans[j] *= post;
                post *= arrs[j];
            }
            return ans;
        }
}
