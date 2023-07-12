package Arrays;

public class ReplaceElementwthGrtest {
    public int[] replaceElements(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1 ; i>=0 ; i--){
            if(arr[i] > max){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }else{
                arr[i] = max;
            }
           
        }
         return arr;
    }
        
    }
