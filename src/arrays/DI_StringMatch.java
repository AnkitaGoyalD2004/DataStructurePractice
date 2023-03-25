package Arrays;

public class DI_StringMatch {
    public int[] diStringMatch(String s) {
        int arr[]=new int[s.length()+1];
        int l=0;
        int r=s.length();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                arr[i]=l;
                l++;
            }else{
                arr[i]=r;
                r--;
            }
        }
        arr[arr.length-1]=l;
        return arr;
        }
}
