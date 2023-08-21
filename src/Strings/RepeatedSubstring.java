package Strings;
import java.util.*;
public class RepeatedSubstring {
    public boolean repeatedSubstring(String s){
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    sb.append(s.substring(0, i));
                }
                if (s.equals(sb.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}
