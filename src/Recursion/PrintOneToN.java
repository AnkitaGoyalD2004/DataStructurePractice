package Recursion;
import java.util.Scanner;
public class PrintOneToN {
//this will print from n to 1
  public static void rec(int n){
        if(n == 0){
            return ;
        }
         
        System.out.println(n);
        rec(n-1);
        
    }
  //This will print from 1 to n
    public static void rec1(int n){
        if(n == 0){
            return ;
        }
         
        System.out.println(n);
        rec(n-1);
        
    }
    public static void main(String[] args){
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   rec(n);
}
}
