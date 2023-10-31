package StacksAndQueues;
import java.util.Stack;
public class MinStack {
    public static void main(String[] args){

    }
        Stack<Integer> s;
        Stack<Integer> minStack;

    public MinStack() {
        s = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minStack.isEmpty() || val <= minStack.peek() ){
            minStack.push(val);
        }

    }
    
    public void pop() {
        int a = s.pop();
        if(minStack.peek() == a){
            minStack.pop();
        }
    }
    
    public  int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
