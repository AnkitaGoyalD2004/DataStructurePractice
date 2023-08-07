package StacksAndQueues;
import java.util.Stack;
public class ValidateStackSequence {
    public static void main(String[] args){

    }

    public boolean validateStackSequences(int pushed[] , int popped[]){
       Stack<Integer> s = new Stack<>();
       int j = 0 ;
        for(int i : pushed){
            s.push(i);
            while(!s.isEmpty() && s.peek() == popped[j]){
                s.pop();
                j++;
            }
        }
        return s.isEmpty();
    }
}
