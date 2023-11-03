package StacksAndQueues;

import java.util.*;

public class BuildAnArray {
    public static void main(String[] args) {
        
    }
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int i = 0;
        for(int num : target){
            while(i< num-1){
                result.add("Push");
                result.add("Pop");
                i++ ;
            }
            result.add("Push");
            i++ ; 
        }
        return result;
    }
}
