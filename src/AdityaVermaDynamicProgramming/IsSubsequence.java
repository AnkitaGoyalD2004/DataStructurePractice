package AdityaVermaDynamicProgramming;

public class  IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i!=s.length()){
            return false;
        }
        return true;
    }
}
