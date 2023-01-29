package AdityaVermaDynamicProgramming;

public class SuperEggDrop {
    //Recursive Solution (TLE):
    public int superEggDrop(int n, int k) {
        return Helper(k, n);
    }
    
    private int Helper(int eggs, int floors) {
        if (floors == 0 || floors == 1) {
            return floors;
        }
        if (eggs == 1) {
            return floors;
        }
        
        int min = Integer.MAX_VALUE;
        for (int k = 1; k <= floors; k++) {
            int Breaks = Helper(eggs-1, k-1);
            int DoesNotBreak = Helper(eggs, floors - k);
            int temp = 1 + Math.max(Breaks, DoesNotBreak);
            min = Math.min(min, temp);
        }
        return min;
    }
    //Memo(TLE)
    public int dP(int n, int k){
        if(n == 1){return k;}
        if(k== 0 || k== 1){return k;}
        if(dp[n][k] != -1){return dp[n][k];}
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            int ans1 = dP(n-1,i-1);
            int ans2 = dP(n,k-i);
            int ans3 = 1+Math.max(ans1, ans2);
            ans = Math.min(ans, ans3);
        }
        return dp[n][k] = ans;
    }
    int dp[][];
    public int superEggDrop1(int k, int n) {
        dp = new int[k+1][n+1];
       for(int i = 0;i<dp.length;i++){
        for(int j = 0;j<dp[0].length;j++){
            dp[i][j] = -1;
        }
       }
       int ans = dP(k,n);
        return ans;
    }
    // Optimized ( Binary Search Solution ):
    public int superEggDrop2(int k, int n) {
        Integer[][] dp = new Integer[k+1][n+1];
        return superEggDropHelper(k, n, dp);
    }
    
    private int superEggDropHelper(int eggs, int floors, Integer[][] dp) {
        if (floors == 0 || floors == 1) {
            return floors;
        }
        if (eggs == 1) {
            return floors;
        }
        if (dp[eggs][floors] != null)
            return dp[eggs][floors];
        
        int min = Integer.MAX_VALUE, low = 0, high = floors;
        while (low <= high) {
            int mid = (low + high) / 2;
            int lowerFloors = 0, higherFloors = 0;
            if (dp[eggs-1][mid-1] != null) {
                lowerFloors = dp[eggs-1][mid-1];
            } else {
                lowerFloors = superEggDropHelper(eggs-1, mid - 1, dp);
                dp[eggs-1][mid-1] = lowerFloors;
            }
            if (dp[eggs][floors-mid] != null) {
                higherFloors = dp[eggs][floors-mid];
            } else {
                higherFloors = superEggDropHelper(eggs, floors - mid, dp);
                dp[eggs][floors-mid] = higherFloors;
            }
            
            if (lowerFloors < higherFloors) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            int temp = 1 + Math.max(lowerFloors, higherFloors);
            min = Math.min(min, temp);
        }
        return dp[eggs][floors] = min;
    }
}
