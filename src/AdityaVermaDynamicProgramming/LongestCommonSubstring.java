package AdityaVermaDynamicProgramming;

public class LongestCommonSubstring {

	static int a= Integer.MIN_VALUE;
    public static int longestCommonSubstr(String S1,String S2, int n, int m, int count ){
        if(n == 0|| m == 0){return count;}
        if(count>a){a= count;}
        if(S1.charAt(n-1) == S2.charAt(m-1)){
            int a = longestCommonSubstr(S1,S2,n-1,m-1,count+1);
            return a;
        }else{
            int ans1 = longestCommonSubstr(S1,S2,n-1,m,0);
            int ans2 =longestCommonSubstr(S1,S2,n,m-1,0);
            int a =  Math.max(ans1, ans2);
            return a;
        }
    }
    public static int dp(String S1, String S2, int n, int m){
        int t[][] = new int[n+1][m+1];
        int ans = Integer.MIN_VALUE;
        for(int i = 1;i<n+1;i++){
            for(int j =1;j<m+1;j++){
                if(S1.charAt(i-1) == S2.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                    ans = (ans>t[i][j])?ans:t[i][j];
                }else{
                    t[i][j] = 0;
                }
            }
        }
        ans = (ans == Integer.MIN_VALUE)?0:ans;
        return ans;
    }
}
