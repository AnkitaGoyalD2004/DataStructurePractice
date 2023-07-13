package StacksAndQueues;
import java.util.*;
public class MinNoOfSwaps {
    public static void main(String[] args){

    }
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>(); 
        for(char c : s.toCharArray()){
            if(c == '['){
                stack.push(c);
            }else if(!stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        double pair = stack.size()/2;
        double a = pair/2.0;
        return (int)Math.ceil(a);
    }
}
