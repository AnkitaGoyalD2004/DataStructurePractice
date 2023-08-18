package BinarySearch;

public class InputSumTwo {
    public int[] twoSum(int[] numbers , int target){
        int i = 0;
        int  j = numbers.length-1;
       int result[] = new int[2];
       while(i<j){
        if(numbers[i] + numbers[j] == target && i != j){
            result[0] = ++i;
            result[1] = ++j;
            break;
        }else if(numbers[i] + numbers[j] > target){
            j--;
        }else{
            i++;
        }
       }
       return result;
    }
}
