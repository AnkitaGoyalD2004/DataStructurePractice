package StacksAndQueues;

import java.util.Stack;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];         
        // move from right to left
        for (int i = n - 1; i >= 0; i--) {
            // pop all the indices with lower or equal temperature
            while (!s.isEmpty() && temperatures[i] >= temperatures[s.peek()]) {
                s.pop();
            }
            // this means the next warmer temperature exists!
            if (!s.isEmpty()) {
                result[i] = s.peek() - i; // distance between next greater and current
            }
            // insert current index to the stack
            s.push(i);
        }
        return result;
    }
}
