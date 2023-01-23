package AdityaVermaDynamicProgramming;

public class pallindromicPartition2{
    public static boolean isPalindrome(String s, int i, int j) {
      
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    } 
     public static int solve(String s){
        int i=0;j=s.length-1;
        if(i>=j){return 0;}
        if (isPalindrome(s, i, j)) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j-1;k++){
            int temp1 = solve(arr,i,k);
            int temp2 = solve(arr,k+1,j);
            int temp = temp1+temp2+1;
            min =(temp<min)?temp:min;
        }
        return min;
    }
    Public static int minCut(int String s){
        int  i = 0,j = s.length()-1;
         int memo[][] = new int [arr.length+1][arr.length+1];
         for(int a = 0;a<memo.length;a++){
             for(int b = 0;b<memo[0].length;b++){
                 memo[a][b] = -1;
             }
         }
         int ans = solveMemo(s,i,j,memo);
         return ans;
     }
    public static int solveMemo(String s, int i, int j, int[][] memo) {
        if (i >= j) {
            return 0;
        }
        if (isPalindrome(s, i, j)) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp1 = solveMemo(s,i,k,memo);
            int temp2 = solveMemo(s,k+1,j,memo);
            int temp = temp1+temp2+1;
            min =(temp<min)?temp:min;
        }
        memo[i][j] = min;
        return min;
    }

    Public static int minCut(int String s){
        int  i = 0,j = s.length()-1;
         int dp[][] = new int [arr.length+1][arr.length+1];
         for(int a = 0;a<memo.length;a++){
             for(int b = 0;b<memo[0].length;b++){
                 dp[a][b] = -1;
             }
         }
         int ans = solve(s,i,j,dp);
         return ans;
     }

    public static int solve(String s, int i, int j, int[] dp){
        if(i>=j){return 0;}
        if(dp[i]!=-1){return dp[i];}
        if(isPalindrome(s, i, j)){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i;k<j;k++){
            if(isPalindrome(s, i, k)){
                int temp = solve(s,k+1,j,dp)+1;
                ans = Math.min(ans, temp);
            }
        }
        return dp[i] = ans;

}
