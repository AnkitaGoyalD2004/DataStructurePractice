package StacksAndQueues;

import java.util.*;

public class RemoveKDigiits {
    public String removeKdigits(String num, int k) {
        if (k == num.length())
            return "0";

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            char ch = num.charAt(i);
            while (!stack.isEmpty() && stack.peek() > ch && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(ch);
            i++;
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();
        while (sb.charAt(0) == '0' && sb.length() > 1)
            sb.deleteCharAt(0);
        return sb.toString();
    }
}
