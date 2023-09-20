package Sorting;

public class bubbleSort {
    public static void main(String[] args){
        // int[] arr={7,3,6,9,12,45,36};
        String[] arr = {"Ankita", "Dishu" , "Tashu" ,"kanav"};
        String temp;
        for(int  i = 0 ; i< arr.length ;i++){
            for(int j = 0 ; j<arr.length-1-i ; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int  i= 0 ; i< arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
    }
}
