package Backtracking;

public class ArchievableTransferRequest {
    int max = Integer.MIN_VALUE;
    public int maximumRequests(int n, int[][] requests) {
        helper(requests, new int[n], 0, 0);
        return max;
        
    }

    public void helper(int[][] requests, int[] buildingArr, int reqCount, int ind) {

        if (ind >= requests.length) {

            for (int building : buildingArr) {
                if (building != 0) {
                    return;
                }
            }
            max = Math.max(max, reqCount);
            return;
        }

        buildingArr[requests[ind][0]]--;
        buildingArr[requests[ind][1]]++;
        helper(requests, buildingArr, reqCount + 1, ind + 1);
        buildingArr[requests[ind][0]]++;
        buildingArr[requests[ind][1]]--;

        helper(requests, buildingArr, reqCount, ind + 1);
    }
}
