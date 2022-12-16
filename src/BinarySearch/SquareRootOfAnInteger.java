package BinarySearch;

public class SquareRootOfAnInteger {

	public static int mySqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		int start = 1;
		int end = x;
		int ans =0;
		while (start <= end) {
			int mid = start + (end-start) / 2;
			// instead of mid*mid we are giving x/mid to tackle overflow of integer
			if (mid == x / mid) ans = mid;;
			if (mid < x / mid) start = mid + 1;	
			else {
				end = mid - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int x = -1;
		System.out.print(mySqrt(x));
	}
}
