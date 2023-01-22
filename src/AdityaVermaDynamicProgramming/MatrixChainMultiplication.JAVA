package AdityaVermaDynamicProgramming;

public class MatrixChainMultiplication{
    // Recursion
    public static int solve(int arr[], int i,int j){
        if(i>=j){return 0;}
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j-1;k++){
            int temp1 = solve(arr,i,k);
            int temp2 = solve(arr,k+1,j);
            int temp = temp1+temp2+(arr[i-1]*arr[k]*arr[j]);
            min =(temp<min)?temp:min;
        }
        return ans;
    }
    // Memoization
    Public static int matrixMultiplication(int arr[], int N){
       int  i = 1,j = arr.length-1;
        int memo[][] = new int [arr.length+1][arr.length+1];
        for(int a = 0;a<memo.length;a++){
            for(int b = 0;b<memo[0].length;b++){
                memo[a][b] = -1;
            }
        }int
        int ans = solveMemo(arr,i,j,memo);
        return ans;
    }
    public static int solveMemo(int arr[], int i, int j, int[][] memo){
        if(i>=j){return 0;}
        if(memo[i][j]!=-1){return memo[i][j];}
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp1 = solveMemo(arr,i,k,memo);
            int temp2 = solveMemo(arr,k+1,j,memo);
            int temp = temp1+temp2+(arr[i-1]*arr[k]*arr[j]);
            min =(temp<min)?temp:min;
        }
        memo[i][j] = min;
        return min;
    }

}
