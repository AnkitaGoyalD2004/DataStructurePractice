package HashMap;
import java.util.Arrays;
public class ValidAnagram {
    public boolean isAnagram(String s , String t){
     char [] c = s.toCharArray();
     char [] d = t.toCharArray();

     Arrays.sort(c);
     Arrays.sort(d);
     
        boolean a = Arrays.equals(c,d);
        return a;
    }
}
