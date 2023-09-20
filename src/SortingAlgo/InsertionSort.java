package Sorting;

public class InsertionSort {
    public static void helper(int[] nums){
        int temp ; int j;
        for(int i = 1 ; i< nums.length ; i++){
            temp = nums[i];
            j =i;
            while(j>0 && nums[j-1] > nums[i]){
                nums[j] = nums[j-1];
                j--;
            }
            nums[i] = temp;
        }
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i]);
        }
    }
    public static void main(String[] args){
        
    }
}
