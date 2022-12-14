package AdityaVermaDynamicProgramming;

public class CountOfSubset {
	public static int count = 0;
    public static int count(int[] arr, int N, int X) {
		recur(arr, N, X);
		return count;
	}

	public static void recur(int[] arr, int N, int X) {
		if (N == 0) {
			if (X == 0) {
				count++;
			}
			return;
		}
		recur(arr, N - 1, X);
		recur(arr, N - 1, X - arr[N - 1]);
	}

	static int memo[][] = new int[1002][1002];

	public static int countMemo(int arr[], int N, int X, int count) {
		if (N == 0) {
			if (X == 0) {
				return 1;
			}
			return 0;
		}
		if (X == 0) {
			count++;
			return count;
		} else if (memo[N][X] != -1) {
			return memo[N][X];
		} else {
			int a = countMemo(arr, N - 1, X, count);
			int b = countMemo(arr, N - 1, X - arr[N - 1], count);
			count += a + b;
			memo[N][X] = count;
			return count;
		}
	}

	public static int countDp(int[] arr, int N, int X) {
		int [][] t = new int[N+1][X+1];
		for(int i = 0;i<N+1;i++) {
			t[i][0] = 1;
		}
		for(int i = 1;i<N+1;i++) {
			for(int j = 1;j<X+1;j++) {
				if(arr[i-1]<=j) {
					t[i][j] = t[i-1][j]+t[i-1][j-arr[i-1]];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[N][X];
}
	public static void main(String[] args){
		int arr[] = {2,3,5,6,8,10};
		for(int i =0;i<memo.length;i++) {
			for(int j =0;j<memo[0].length;j++) {
				memo[i][j] = -1;
			}
		}
		System.out.print(countMemo(arr,arr.length,10,0));
	}
}
