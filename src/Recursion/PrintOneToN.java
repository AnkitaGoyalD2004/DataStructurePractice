package Recursion;

public class PrintOneToN {
    public static void main(String[] args){

    }
    public int print(int n){
        if(n==1){
            return 1;
        }
        int c = print(n-1);
        return c+n;
    }
}
