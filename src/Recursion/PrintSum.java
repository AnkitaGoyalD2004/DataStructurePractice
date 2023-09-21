package Recursion;

public class PrintSum {
   public static void main(String[] args){
      printSum(1 , 5,0);
   }
   public static void printRoughSum(int i ){
    int n = 6 , sum = 0;
    if(i == n){
        sum +=i;
        System.out.print(sum);
        return;
    }
    sum += i;
    printRoughSum(i+1 );
   } 
    public static void printSum(int i , int n , int sum ){
    if(i == n){
        sum +=i;
        System.out.print(sum);
        return;
    }
    sum += i;
    printSum(i+1 , n , sum );
   } 
}
