package StacksAndQueues;
import java.util.*;
public class ParenthesesValid {
    public int minAddToMakeValid(String s) {
        Stack<Integer> S  = new Stack<>();
        int count  = 0 ; 
        for(int i = 0 ; i <s.length() ; i++){
            if(s.charAt(i) == '('){
                S.push(i);
                count++;
            }else if(S.isEmpty() && s.charAt(i) == ')'){
                count++;
            }
            
            else {
                S.pop();
                count --;
            }
        }
        return count;
    }
}
