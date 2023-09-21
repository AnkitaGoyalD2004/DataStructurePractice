package Recursion;

import Sorting.selectionSort;

public class Basic {
    public static void main(String[] args){
    int n =1;
    printRevNum(n);
    } 
    // print from n to 1
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    // print from 1 to n
    public static void printRevNum(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printRevNum(n+1);
    }
}
