package AdityaVermaDynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class ScrambledString {
       
    public boolean isScramble1(String s1, String s2) {
        int n1 = s1.length(),n2 = s2.length();
        if(n1 != n2){return false;}
        memo = new HashMap<String,Boolean>();
        boolean ans = Dp(s1,s2);
        return ans;
    }
    HashMap<String,Boolean> memo;

    public boolean Dp(String s1,String s2){
        if(s1.equals(s2)){return true;}
        if(s1.length()<=1 || s2.length()<=1){return false;}
        String key = s1+" "+s2;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        boolean flag = false;
        int n = s1.length();
        for(int i = 1;i<n;i++){
            boolean condition1 = Dp(s1.substring(0,i),s2.substring(n-i,n)) && Dp(s1.substring(i,n),s2.substring(0,n-i));
            if(condition1){flag = true;
                break;
            }
            boolean condition2 = Dp(s1.substring(0,i),s2.substring(0, i)) && Dp(s1.substring(i, n),s2.substring(i, n));
            if(condition2){flag = true;
                break;
            }
        }
        memo.put(key,flag);
        return flag;
    }
    // TLE 
    public boolean isScramble(String s1, String s2) {
        if(s1.compareTo(s2) == 0){
            return true;
        }if(s1.length() < 1){
            return false;
        }
        int n = s1.length();
        boolean flag = false;
        for(int i =1;i<=n-1;i++){
            boolean swap=(isScramble(s1.substring(0, i),s2.substring(n - i,n)) && isScramble(s1.substring(i, n),s2.substring(0, n-i)));
         
            boolean noswap=(isScramble(s1.substring(0, i),s2.substring(0, i))  && isScramble(s1.substring(i, n),s2.substring(i, n)));
        if(swap || noswap){
                flag = true;
                break;
        }
    }
        return flag;
    }
}

